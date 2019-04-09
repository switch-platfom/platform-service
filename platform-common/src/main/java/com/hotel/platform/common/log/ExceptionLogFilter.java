package com.hotel.platform.common.log;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;
import com.hotel.platform.common.model.ErrorLogModal;

/**
 * Created by mowei on 2019/4/9.
 */
public class ExceptionLogFilter extends Filter<ILoggingEvent> {
    @Override
    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        if (iLoggingEvent.getMessage() != null && iLoggingEvent.getMessage().startsWith(ErrorLogModal.PREFIX)
                && iLoggingEvent.getMessage().endsWith(ErrorLogModal.SUFFIX)) {
            return FilterReply.ACCEPT;
        }
        return FilterReply.DENY;
    }
}
