package com.explore.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * 主数据库配置
 *
 * @Author HaiQing.Yu
 * @Date 2022/10/9 15:19
 */
@Configuration
@MapperScan(basePackages = {SlaveDataSourceConfig.BASE_PACKAGE}, sqlSessionFactoryRef = "slaveSqlSessionFactory")
public class SlaveDataSourceConfig {

    static final String BASE_PACKAGE = "com.explore.mapper.slave";
    static final String MAPPER_LOCATION = "classpath:mapper/slave/*.xml";

    @Value("${spring.datasource.druid.slave.username}")
    private String userName;

    @Value("${spring.datasource.druid.slave.password}")
    private String password;

    @Value("${spring.datasource.druid.slave.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.druid.slave.url}")
    private String url;

    @Bean(name = "slaveDataSource")
    public DataSource slaveDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(userName);
        druidDataSource.setPassword(password);
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        return druidDataSource;
    }

    @Bean(name = "slaveDataSourceTransactionManager")
    public DataSourceTransactionManager slaveDataSourceTransactionManager(@Qualifier("slaveDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "slaveSqlSessionFactory")
    public SqlSessionFactory slaveSqlSessionFactory(@Qualifier("slaveDataSource") DataSource dataSource) throws Exception {
        final MybatisSqlSessionFactoryBean factoryBean = new MybatisSqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(SlaveDataSourceConfig.MAPPER_LOCATION));
        return factoryBean.getObject();
    }

}
