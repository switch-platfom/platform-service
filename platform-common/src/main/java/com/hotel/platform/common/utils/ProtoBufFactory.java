package com.hotel.platform.common.utils;

import java.util.concurrent.ConcurrentHashMap;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import com.hotel.platform.common.log.LogFactory;

public final class ProtoBufFactory {
    private static LogFactory.Log LOGGER = LogFactory.getInstance().getLogger(ProtoBufFactory.class);
    private static ConcurrentHashMap<String, Object> schemaConcurrentMap = null;

    public static ProtoBufFactory getInstance() {
        return ProtoBufHolder.INSTANCE;
    }

    private ProtoBufFactory() {
        synchronized (this) {
            if (schemaConcurrentMap == null) {
                schemaConcurrentMap = new ConcurrentHashMap<>();
            }
        }
    }

    private static class ProtoBufHolder {
        final static ProtoBufFactory INSTANCE = new ProtoBufFactory();
    }

    /**
     * 使用probuf将对象序列化成字节数组
     *
     * @param t
     * @param messageClass
     * @return
     */
    public <T> byte[] protoBufSerialize(T t, Class<T> messageClass) {
        if (t == null) {
            return null;
        }
        try {
            Schema<T> schema;
            if (schemaConcurrentMap.containsKey(t.getClass().getName())) {
                schema = (Schema<T>) schemaConcurrentMap.get(t.getClass().getName());
            } else {
                schema = RuntimeSchema.getSchema(messageClass);
                schemaConcurrentMap.put(t.getClass().getName(), schema);
            }
            LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
            byte[] data = ProtobufIOUtil.toByteArray(t, schema, buffer);
            return data;
        } catch (Exception ex) {
            LOGGER.logError("protoBufSerialize exception", ex);
            return null;
        }
    }

    /**
     * 使用protobuf将字节数组反序列化成对象
     *
     * @param data
     * @param messageClass
     * @return
     */
    public <V> V protoBufDeserialize(byte[] data, Class<V> messageClass) {
        if (data == null) {
            return null;
        }

        try {
            Schema<V> schema;
            if (schemaConcurrentMap.containsKey(messageClass.getName())) {
                schema = (Schema<V>) schemaConcurrentMap.get(messageClass.getName());
            } else {
                schema = RuntimeSchema.getSchema(messageClass);
                schemaConcurrentMap.put(messageClass.getName(), schema);
            }
            V v = messageClass.newInstance();
            ProtobufIOUtil.mergeFrom(data, v, schema);
            return v;
        } catch (InstantiationException | IllegalAccessException e) {
            LOGGER.logError("protoBufDeserialize exception", e);
        }
        return null;
    }
}
