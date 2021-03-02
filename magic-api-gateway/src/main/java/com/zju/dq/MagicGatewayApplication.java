package com.zju.dq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Linker
 * @date 2021/3/2 15:30
 * @description：
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MagicGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MagicGatewayApplication.class, args);
    }
}
