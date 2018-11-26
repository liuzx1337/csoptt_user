package com.csoptt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 * 可被注册中心发现
 * 可调用FeignClient
 * 扫描dao层
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.csoptt.**.dao")
public class CsopttUserMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsopttUserMainApplication.class, args);
	}
}
