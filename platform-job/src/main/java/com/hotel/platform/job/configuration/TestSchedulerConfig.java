package com.hotel.platform.job.configuration;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.hotel.platform.job.controller.TestTask;

/**
 * Created by mowei on 2019/4/7.
 */
@Configuration
public class TestSchedulerConfig {

    @Bean
    public JobDetail testTaskDetail() {
        return JobBuilder.newJob(TestTask.class).withIdentity("testTaskDetail").storeDurably().build();
    }

    @Bean
    public Trigger testTaskTrigger() {
        // corn表达式参考 http://cron.qqe2.com/
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ? *");
        return TriggerBuilder.newTrigger().forJob(testTaskDetail()).withIdentity("testTaskTrigger").withSchedule(scheduleBuilder)
                .build();
    }

    @Bean
    public SchedulerFactoryBean testTaskScheduler() {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setTriggers(testTaskTrigger());
        schedulerFactoryBean.setJobDetails(testTaskDetail());
        return schedulerFactoryBean;
    }
}
