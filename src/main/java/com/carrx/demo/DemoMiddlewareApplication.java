package com.carrx.demo;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 项目启动类
 *
 * @Author: Carl.Xiang
 * @Date: 2019/12/31 13:46
 **/
@SpringBootApplication
@MapperScan(basePackages = {"com.carrx.demo.middleware.mapper"})
public class DemoMiddlewareApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMiddlewareApplication.class, args);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
                // 忽略反序列化时不存在的字段
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }
}
