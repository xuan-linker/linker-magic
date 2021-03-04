package com.zju.dq.config;

import com.zju.dq.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Linker
 * @date 2021/3/4 13:35
 * @description：Swagger API文档相关配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.zju.dq.controller")
                .title("magic后台系统")
                .description("magic后台相关接口文档")
                .contactName("Linker")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
