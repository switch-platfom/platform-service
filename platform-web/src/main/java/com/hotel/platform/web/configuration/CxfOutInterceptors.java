package com.hotel.platform.web.configuration;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

/**
 * Created by mowei on 2019/4/9.
 */
public class CxfOutInterceptors extends AbstractPhaseInterceptor<Message> {
    public CxfOutInterceptors() {
        super(Phase.PRE_STREAM);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        // TODO 格式化输出
        message.put("disable.outputstream.optimization", Boolean.TRUE);
    }
}
