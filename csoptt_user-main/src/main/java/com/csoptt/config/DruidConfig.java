package com.csoptt.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.csoptt.properties.DruidPoolProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Druid连接池配置
 *
 * @author qishao
 * @date 2018-11-24
 */
@Configuration
public class DruidConfig {

    /**
     * Log4j
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(DruidConfig.class);

    /**
     * 连接池基本配置
     */
    @Autowired
    private DataSourceProperties dataSourceProperties;

    /**
     * druid连接池详细配置
     */
    @Autowired
    private DruidPoolProperties druidPoolProperties;

    /**
     * 连接池bean
     * 在同样的DataSource中，首先使用被标注的DataSource
     *
     * @return
     */
    @Bean
    @Primary
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        // 基本配置
        dataSource.setUrl(dataSourceProperties.getUrl());
        dataSource.setUsername(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());
        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        // 详细配置
        dataSource.setInitialSize(druidPoolProperties.getInitialSize());
        dataSource.setMinIdle(druidPoolProperties.getMinIdle());
        dataSource.setMaxActive(druidPoolProperties.getMaxActive());
        dataSource.setMaxWait(druidPoolProperties.getMaxWait());
        dataSource.setTimeBetweenEvictionRunsMillis(druidPoolProperties.getTimeBetweenEvictionRunsMillis());
        dataSource.setMinEvictableIdleTimeMillis(druidPoolProperties.getMinEvictableIdleTimeMillis());
        dataSource.setValidationQuery(druidPoolProperties.getValidationQuery());
        dataSource.setTestWhileIdle(druidPoolProperties.isTestWhileIdle());
        dataSource.setTestOnBorrow(druidPoolProperties.isTestOnBorrow());
        dataSource.setTestOnReturn(druidPoolProperties.isTestOnReturn());
        dataSource.setPoolPreparedStatements(druidPoolProperties.isPoolPreparedStatements());
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(druidPoolProperties.getMaxPoolPreparedStatementPerConnectionSize());
        try {
            dataSource.setFilters(druidPoolProperties.getFilters());
        } catch (SQLException e) {
            LOGGER.error("Set Filter failed.", e);
        }
        dataSource.setConnectionProperties(druidPoolProperties.getConnectionProperties());

        return dataSource;
    }

    /**
     * 添加监控的servlet
     * @return
     */
    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<>();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings("/druid/*");
        Map<String, String> initParameters = new HashMap<>();
        initParameters.put("resetEnable", "false");// 禁用HTML页面上的“Reset All”功能
        initParameters.put("allow", "127.0.0.1"); // IP白名单 (没有配置或者为空，则允许所有访问)
        servletRegistrationBean.setInitParameters(initParameters);
        return servletRegistrationBean;
    }
}
