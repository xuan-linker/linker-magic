package com.zju.dq.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Linker
 * @date 2021/3/4 11:37
 * @description：
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.zju.dq.mapper", "com.zju.dq.dao"})
public class MyBatisConfig {
}
