package com.hotel.platform.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanContext implements ApplicationContextAware {
    private volatile static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return context;
    }

    public static Object getBean(String beanName) {
        if (context.containsBean(beanName)) {
            return context.getBean(beanName);
        } else {
            return null;
        }
    }

    public static Object getBean(String beanName, Object... args) {
        if (context.containsBean(beanName)) {
            return context.getBean(beanName, args);
        } else {
            return null;
        }
    }
}
