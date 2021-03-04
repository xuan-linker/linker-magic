package com.zju.dq;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Linker
 * @date 2021/3/4 16:24
 * @description：
 */
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class MagicMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MagicMonitorApplication.class, args);
    }
}
