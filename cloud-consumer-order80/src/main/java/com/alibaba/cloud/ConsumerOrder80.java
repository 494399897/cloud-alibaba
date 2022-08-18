package com.alibaba.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
public class ConsumerOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrder80.class, args);
        log.info("order start succeed");

    }
}
