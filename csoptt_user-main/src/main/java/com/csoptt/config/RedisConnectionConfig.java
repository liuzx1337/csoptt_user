package com.csoptt.config;

import com.csoptt.properties.RedisProperties;
import com.csoptt.utils.jedis.JedisUtil;
import com.csoptt.utils.jedis.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Redis连接配置
 *
 * @author qishao
 * @date 2018-11-26
 */
@Configuration
public class RedisConnectionConfig {

    /**
     * redis配置
     */
    @Autowired
    private RedisProperties redisProperties;

    /**
     * redis工具
     * @return
     * @author qishao
     * date 2018-11-28
     */
    @Bean
    public JedisUtil jedisUtil() {
        RedisConfig.redisHost = redisProperties.getHost();
        RedisConfig.redisPort = redisProperties.getPort();
        RedisConfig.redisPassword = redisProperties.getPassword();
        RedisConfig.redisDbnum = redisProperties.getDatabase();

        return JedisUtil.getInstance();
    }
}
