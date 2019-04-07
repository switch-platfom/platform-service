package com.hotel.platform.common.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;

public class JaxbFactory {
    private static Logger LOGGER = LogUtil.getLogger(JaxbFactory.class);
    private final static Object LOCK_OBJECT = new Object();
    private static Map<String, JAXBContext> jaxbContextMap;

    private JaxbFactory() {
        synchronized (LOCK_OBJECT) {
            if (jaxbContextMap == null) {
                jaxbContextMap = new ConcurrentHashMap<>();
            }
        }
    }

    public static JaxbFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void init(String key, Class<?>[] clazz) {
        try {
            JAXBContext currentContext = JAXBContext.newInstance(clazz);
            jaxbContextMap.put(key, currentContext);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public void init(String key, String... packages) {
        List<String> classNames = getClasses(packages);
        if (classNames == null) {
            return;
        }
        List<Class> classes = new ArrayList<>(classNames.size());
        for (String clsName : classNames) {
            try {
                Class<?> clazz = Class.forName(clsName);
                if (clazz != null && !clazz.getName().contains("package-info")) {
                    classes.add(clazz);
                }
            } catch (Exception ex) {
                LOGGER.error("init exception", ex);
            }
        }
        Class<?>[] arrayClass = new Class[classes.size()];
        init(key, classes.toArray(arrayClass));
    }

    public Unmarshaller getUnmarshaller(String key) throws JAXBException {
        if (jaxbContextMap == null || !jaxbContextMap.containsKey(key)) {
            throw new RuntimeException("can not find jaxb context");
        }
        JAXBContext currentContext = jaxbContextMap.get(key);
        return currentContext.createUnmarshaller();
    }

    public Marshaller getMarshaller(String key) throws JAXBException {
        if (jaxbContextMap == null || !jaxbContextMap.containsKey(key)) {
            throw new RuntimeException("can not find jaxb context");
        }
        JAXBContext currentContext = jaxbContextMap.get(key);
        Marshaller marshaller = currentContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        return marshaller;
    }

    private static class SingletonHolder {
        private static final JaxbFactory INSTANCE = new JaxbFactory();
    }

    public ArrayList<String> getClasses(String... packageNames) {
        ArrayList<String> classes = new ArrayList<>();
        for (String packageName : packageNames) {
            String packagePath = packageName.replace('.', '/');
            URL url = JaxbFactory.class.getResource("/" + packagePath);
            if (url == null) {
                return classes;
            }
            if ("jar".equalsIgnoreCase(url.getProtocol())) {
                String path = url.getPath();
                int i = path.lastIndexOf('!');
                if (i >= 0) {
                    path = path.substring(0, i);
                }
                try (JarFile jar = new JarFile(new File(new URL(path).toURI()))) {
                    Enumeration<JarEntry> e = jar.entries();
                    while (e.hasMoreElements()) {
                        path = e.nextElement().getName();
                        if (path.startsWith(packagePath) && path.endsWith(".class")) {
                            classes.add(path.substring(0, path.length() - 6).replace('/', '.'));
                        }
                    }
                } catch (IOException | URISyntaxException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    String root = new File(url.toURI()).getPath();
                    root = root.substring(0, root.length() - packagePath.length());
                    search(classes, root, packagePath);
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return classes;
    }

    private void search(ArrayList<String> classes, String root, String path) {
        File folder = new File(root + path);
        String[] list = folder.list();
        if (list == null) {
            return;
        }
        for (String file : folder.list()) {
            if (new File(root + path + "/" + file).isDirectory()) {
                search(classes, root, path + "/" + file);
            } else if (file.endsWith(".class")) {
                classes.add(path.replace('/', '.') + "." + file.substring(0, file.length() - 6));
            }
        }
    }
}
