package com.hotel.platform.business.core.sender;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author wmo
 * @CreateDate 2019/3/22 14:53
 * @Version 1.0
 * @Description
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SendSupplierType {
    SenderVendor version();

    SenderType type();
}
