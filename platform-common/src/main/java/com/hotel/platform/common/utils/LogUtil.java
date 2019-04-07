package com.hotel.platform.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mowei on 2019/4/7.
 */
public class LogUtil {

    public static Logger getLogger(Class<?> claszz) {
        return LoggerFactory.getLogger(claszz);
    }
}
