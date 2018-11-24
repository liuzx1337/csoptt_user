package com.csoptt.config;

import com.alibaba.druid.support.http.WebStatFilter;
import com.csoptt.filter.CorsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * 过滤器相关配置
 *
 * @author qishao
 * @date 2018-11-22
 */
@Configuration
public class SpringFilterConfig {

    /**
     * 跨域
     * @return
     * @author qishao
     * date 2018-11-22
     */
    @Bean
    public FilterRegistrationBean corsFilter() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CorsFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("corsFilter");
        registrationBean.setOrder(8);
        return registrationBean;
    }

    /**
     * 采集web-jdbc监控数据
     * @return
     * @author qishao
     * date 2018-11-24
     */
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean<WebStatFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new WebStatFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
        return registrationBean;
    }
}
