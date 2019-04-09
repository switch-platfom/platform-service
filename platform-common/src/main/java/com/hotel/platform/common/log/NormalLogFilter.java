package com.hotel.platform.common.log;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;
import com.hotel.platform.common.model.ErrorLogModal;
import com.hotel.platform.common.model.InfoLogModal;
import com.hotel.platform.common.model.RequestLogModal;

/**
 * Created by mowei on 2019/4/9.
 */
public class NormalLogFilter extends Filter<ILoggingEvent> {
    @Override
    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        if (iLoggingEvent.getMessage() != null
                && (iLoggingEvent.getMessage().startsWith(RequestLogModal.PREFIX) && iLoggingEvent.getMessage().endsWith(RequestLogModal.SUFFIX))
                || (iLoggingEvent.getMessage().startsWith(ErrorLogModal.PREFIX) && iLoggingEvent.getMessage().endsWith(ErrorLogModal.SUFFIX))
                || (iLoggingEvent.getMessage().startsWith(InfoLogModal.PREFIX) && iLoggingEvent.getMessage().endsWith(InfoLogModal.SUFFIX))) {
            return FilterReply.DENY;
        }
        return FilterReply.ACCEPT;
    }
}
