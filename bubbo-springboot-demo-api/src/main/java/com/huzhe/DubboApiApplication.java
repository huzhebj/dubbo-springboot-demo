package com.huzhe;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboApiApplication {
    private static final Logger log = LoggerFactory.getLogger(DubboApiApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DubboApiApplication.class, args);
        log.info("dubbo-springboot-demo-api started ... ...");
    }
}
