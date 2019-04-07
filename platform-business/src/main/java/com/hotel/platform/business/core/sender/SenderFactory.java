package com.hotel.platform.business.core.sender;

import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author wmo
 * @CreateDate 2019/3/22 14:56
 * @Version 1.0
 * @Description
 */
public class SenderFactory {

    private ServiceLoader<BaseAdapterSender> serviceLoader;
    private Map<String, BaseAdapterSender> senderMap;

    private SenderFactory() {
        serviceLoader = ServiceLoader.load(BaseAdapterSender.class);
        senderMap = new ConcurrentHashMap<>();
    }

    public static SenderFactory getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public BaseAdapterSender getSender(SenderVendor version, SenderType type) {
        String key = String.format("%s_%s", version.toString(), type.toString());
        BaseAdapterSender adapterSender = null;
        if (senderMap.containsKey(key)) {
            return senderMap.get(key);
        } else {
            for (BaseAdapterSender sender : serviceLoader) {
                SendSupplierType annotation = sender.getClass().getAnnotation(SendSupplierType.class);
                if (annotation == null) {
                    continue;
                }
                if (annotation.version() == version && annotation.type() == type) {
                    adapterSender = sender;
                    break;
                }
            }
            if (adapterSender != null) {
                senderMap.put(key, adapterSender);
            }
        }
        return adapterSender;
    }

    private final static class InstanceHolder {
        public static SenderFactory INSTANCE = new SenderFactory();
    }
}
