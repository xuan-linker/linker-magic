package com.zju.dq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Linker
 * @date 2021/3/3 10:39
 * @description：
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.zju.dq")
public class MagicAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(MagicAuthApplication.class, args);
    }
}
