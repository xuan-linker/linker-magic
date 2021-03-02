package com.zju.dq.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Linker
 * @date 2021/3/2 16:48
 * @description：
 */
@Configuration
@MapperScan("com.zju.dq.mapper")
public class MyBatisConfig {
}
