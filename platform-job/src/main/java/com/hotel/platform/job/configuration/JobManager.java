package com.hotel.platform.job.configuration;

import com.github.quartzweb.manager.quartz.QuartzManager;
import com.hotel.platform.common.log.LogFactory;
import org.quartz.Scheduler;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by mowei on 2019/4/10.
 */
@Component
public class JobManager implements ApplicationListener<ContextRefreshedEvent> {
    private final LogFactory.Log LOGGER = LogFactory.getInstance().getLogger(JobManager.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            // corn表达式参考 http://cron.qqe2.com/
            LOGGER.logInfo("start job");
            QuartzManager quartzManager = QuartzManager.getInstance();
            List<Scheduler> schedulers = quartzManager.getSchedulers();
            for (Scheduler scheduler : schedulers) {
                quartzManager.schedulerStart(scheduler.getSchedulerName());
            }
        } catch (Exception e) {
            LOGGER.logError("run job exception", e);
        }
    }
}
