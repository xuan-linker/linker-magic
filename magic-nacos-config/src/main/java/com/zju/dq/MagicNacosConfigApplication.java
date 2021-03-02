package com.zju.dq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Linker
 * @date 2021/3/1 17:08
 * @description：
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MagicNacosConfigApplication {
    public static void main(String[] args) {

        SpringApplication.run(MagicNacosConfigApplication.class, args);
    }
}
