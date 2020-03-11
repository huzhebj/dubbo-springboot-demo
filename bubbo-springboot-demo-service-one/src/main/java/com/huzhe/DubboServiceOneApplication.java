package com.huzhe;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@SpringBootApplication
public class DubboServiceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceOneApplication.class, args);
    }
}
