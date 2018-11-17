package com.csoptt;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * User模块的FeignClient
 *
 * @author liuzixi
 * @date 2018-11-17
 */
@FeignClient("CSOPTT-USER")
public class CsopttUserClient {
}
