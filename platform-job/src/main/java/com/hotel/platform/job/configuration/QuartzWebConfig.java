package com.hotel.platform.job.configuration;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import org.quartz.spi.JobFactory;
import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;

import com.github.quartzweb.http.QuartzWebServlet;
import com.github.quartzweb.manager.bean.ConstructorQuartzBeanManager;
import com.github.quartzweb.manager.bean.QuartzBeanManagerFacade;
import com.github.quartzweb.manager.bean.SpringQuartzBeanManager;

/**
 * Created by mowei on 2019/4/9.
 */
@Configuration
public class QuartzWebConfig {

    /**
     * 继承org.springframework.scheduling.quartz.SpringBeanJobFactory 实现任务实例化方式
     */
    public static class AutowiringSpringBeanJobFactory extends SpringBeanJobFactory implements ApplicationContextAware {

        private transient AutowireCapableBeanFactory beanFactory;

        @Override
        public void setApplicationContext(final ApplicationContext context) {
            beanFactory = context.getAutowireCapableBeanFactory();
        }

        /**
         * 将job实例交给spring ioc托管 我们在job实例实现类内可以直接使用spring注入的调用被spring ioc管理的实例
         * 
         * @param bundle
         * @return
         * @throws Exception
         */
        @Override
        protected Object createJobInstance(final TriggerFiredBundle bundle) throws Exception {
            final Object job = super.createJobInstance(bundle);
            /**
             * 将job实例交付给spring ioc
             */
            beanFactory.autowireBean(job);
            return job;
        }
    }

    /**
     * 配置任务工厂实例
     * 
     * @param applicationContext spring上下文实例
     * @return
     */
    @Bean
    public JobFactory jobFactory(ApplicationContext applicationContext) {
        /**
         * 采用自定义任务工厂 整合spring实例来完成构建任务 see {@link AutowiringSpringBeanJobFactory}
         */
        AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
        jobFactory.setApplicationContext(applicationContext);
        return jobFactory;
    }

    @Bean
    public ServletRegistrationBean quartzServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new QuartzWebServlet());
        servletRegistrationBean.addUrlMappings("/quartz/*");
        servletRegistrationBean.setName("quartz-servlet");
        servletRegistrationBean.setInitParameters(new HashMap<>());
        servletRegistrationBean.getInitParameters().put("resourcePath", "/html");
        servletRegistrationBean.getInitParameters().put("quartWebUser", "username:password;username2:password2");

        return servletRegistrationBean;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(JobFactory jobFactory) throws IOException {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        // 将spring管理job自定义工厂交由调度器维护
        schedulerFactoryBean.setJobFactory(jobFactory);
        // 设置覆盖已存在的任务
        schedulerFactoryBean.setOverwriteExistingJobs(true);
        // 项目启动完成后，等待2秒后开始执行调度器初始化
        schedulerFactoryBean.setStartupDelay(2);
        // 设置调度器自动运行
        schedulerFactoryBean.setAutoStartup(true);
        // 设置上下文spring bean name
        schedulerFactoryBean.setApplicationContextSchedulerContextKey("applicationContext");
        // 设置配置文件位置
        schedulerFactoryBean.setConfigLocation(new ClassPathResource("/quartz.properties"));
        return schedulerFactoryBean;
    }

    @Bean
    public ConstructorQuartzBeanManager constructorQuartzBeanManager() {
        ConstructorQuartzBeanManager constructorQuartzBeanManager = new ConstructorQuartzBeanManager();

        constructorQuartzBeanManager.setPriority(5);

        return constructorQuartzBeanManager;
    }

    @Bean
    public SpringQuartzBeanManager springQuartzBeanManager() {
        SpringQuartzBeanManager manager = new SpringQuartzBeanManager();
        manager.setPriority(10);
        return manager;
    }

    @Bean
    public QuartzBeanManagerFacade quartzBeanManagerFacade() {
        QuartzBeanManagerFacade facade = QuartzBeanManagerFacade.getInstance();

        facade.setQuartzBeanManagers(Arrays.asList(springQuartzBeanManager(), constructorQuartzBeanManager()));
        facade.setUseDefaultQuartzBeanManager(true);

        return facade;
    }
}
