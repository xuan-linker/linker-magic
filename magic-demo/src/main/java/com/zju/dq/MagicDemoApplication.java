package com.zju.dq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Linker
 * @date 2021/3/2 15:53
 * @description：
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MagicDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MagicDemoApplication.class, args);
    }
}
