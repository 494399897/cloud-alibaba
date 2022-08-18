package com.alibaba.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author Admin
 * @version 1.0
 * @project cloud-alibaba
 * @description 服务提供者
 * @date 2022/8/18 15:06:12
 */

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
@EnableFeignClients
@ComponentScan(basePackages = {"com.alibaba.cloud.service","com.alibaba.cloud.controller"})
public class OpenFrignOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(OpenFrignOrder80.class, args);
        System.out.println("-----------------------");
        log.info("OpenFrignOrder80 start succeed");

    }
}
