package com.hotel.platform.web.configuration;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.service.model.ServiceInfo;

/**
 * Created by mowei on 2019/4/9.
 */
public class CxfInInterceptors extends AbstractPhaseInterceptor<Message> {
    public CxfInInterceptors() {
        super(Phase.RECEIVE);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        for (ServiceInfo si : message.getExchange().getService().getServiceInfos()) {
            // ignore namespace
            si.setProperty("soap.force.doclit.bare", true);
        }
    }
}
