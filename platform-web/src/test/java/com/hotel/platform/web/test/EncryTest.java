package com.hotel.platform.web.test;

import org.junit.Test;

import com.alibaba.druid.filter.config.ConfigTools;

/**
 * Created by mowei on 2019/4/9.
 */
public class EncryTest {

    @Test
    public void genPassword() throws Exception {
        ConfigTools.main(new String[] {"root"});
    }
}
