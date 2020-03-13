package com.huzhe.service.two.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.huzhe.service.Demo2Service;
import com.huzhe.service.DemoService;

@Service
public class Demo2ServiceImpl implements Demo2Service {

    @Reference
    private DemoService demoService;

    @Override
    public String sayHello2(String name) {
        String result = demoService.sayHello(name);
        result = result + "=====" + result;
        return result;
    }
}
