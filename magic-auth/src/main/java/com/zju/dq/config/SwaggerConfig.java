package com.zju.dq.config;

import com.zju.dq.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Linker
 * @date 2021/3/3 11:26
 * @description：
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.zju.dq.controller")
                .title("magic认证中心")
                .description("magic认证中心相关接口文档")
                .contactName("linker")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
