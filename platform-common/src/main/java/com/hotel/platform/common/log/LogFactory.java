package com.hotel.platform.common.log;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hotel.platform.common.model.ErrorLogModal;
import com.hotel.platform.common.model.InfoLogModal;
import com.hotel.platform.common.model.RequestLogModal;

/**
 * Created by mowei on 2019/4/7.
 */
public class LogFactory {

    private static Map<String, Log> LOGGER_MAP;

    private LogFactory() {
        LOGGER_MAP = new ConcurrentHashMap<>(256);
    }

    public static LogFactory getInstance() {
        return LogFactoryHolder.INSTANCE;
    }

    private static class LogFactoryHolder {
        static LogFactory INSTANCE = new LogFactory();
    }

    public LogFactory.Log getLogger(Class<?> type) {
        LogFactory.Log logger = LOGGER_MAP.get(type.getName());
        if (logger == null) {
            LogFactory.Log newLogger = new Log(type);
            logger = LOGGER_MAP.putIfAbsent(type.getName(), newLogger);
            if (logger == null) {
                logger = newLogger;
            }
        }

        return logger;
    }

    public static class Log {
        private Logger logger;

        public Log(Class<?> claszz) {
            logger = LoggerFactory.getLogger(claszz);
        }

        public void info(String msg) {
            logger.info(msg);
        }

        public void info(String msg, Object... args) {
            logger.info(msg, args);
        }

        public void logInfo(String content) {
            logger.info(new InfoLogModal(content).toString());
        }

        public void logInfo(String content, Map<String, String> tag) {
            logger.info(new InfoLogModal(content, tag).toString());
        }

        public void logRequest(String content) {
            logger.info(new RequestLogModal(content).toString());
        }

        public void logRequest(String content, Map<String, String> tag) {
            logger.info(new RequestLogModal(content, tag).toString());
        }

        public void logError(String title, Map<String, String> tag) {
            logger.error(title, tag);
        }

        public void logError(String title, Throwable t) {
            logger.error(new ErrorLogModal(title, t).toString());
        }

        public void logError(String title, Throwable t, Map<String, String> tags) {
            logger.error(new ErrorLogModal(title, t, tags).toString());
        }
    }
}
