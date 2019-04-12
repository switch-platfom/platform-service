package com.hotel.platform.dao.configuration;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
@MapperScan(value = "com.hotel.platform.dao.mapper.htlroomspubdb",
        sqlSessionFactoryRef = "htlRoomsPubDbSqlSessionFactory")
public class HtlRoomsPubDbDatasourceConfig {

    @ConfigurationProperties(prefix = "spring.datasource.htlroomspubdb")
    @Bean
    public DataSource htlRoomsPubDbDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    public DataSourceTransactionManager htlRoomsPubDbDataSourceTransactionManager(
            @Qualifier("htlRoomsPubDbDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public SqlSessionFactory htlRoomsPubDbSqlSessionFactory(@Qualifier("htlRoomsPubDbDataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate htlRoomsPubDbSqlSessionTemplate(
            @Qualifier("htlRoomsPubDbSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
