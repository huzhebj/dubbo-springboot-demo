package com.huzhe.service.one.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.huzhe.service.DemoService;

@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot service one)";
    }
}
