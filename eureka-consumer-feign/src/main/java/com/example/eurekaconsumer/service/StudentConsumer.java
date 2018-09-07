package com.example.eurekaconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: MrWang
 * @date: 2018/9/6
 */

@FeignClient("eureka-provider")//配置服务提供者实例名称
public interface StudentConsumer {

    @GetMapping("/student")//服务提供者路由
    Object student();

}
