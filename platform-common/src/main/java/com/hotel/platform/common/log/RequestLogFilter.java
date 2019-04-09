package com.hotel.platform.common.log;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;
import com.hotel.platform.common.model.RequestLogModal;

/**
 * Created by mowei on 2019/4/9.
 */
public class RequestLogFilter extends Filter<ILoggingEvent> {
    @Override
    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        if (iLoggingEvent.getMessage() != null && iLoggingEvent.getMessage().startsWith(RequestLogModal.PREFIX)
                && iLoggingEvent.getMessage().endsWith(RequestLogModal.SUFFIX)) {
            return FilterReply.ACCEPT;
        }
        return FilterReply.DENY;
    }
}
