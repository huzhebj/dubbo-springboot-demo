package com.huzhe;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huzhe.service.Demo2Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCase {
    @Reference
    private Demo2Service demo2Service;
    @Test
    public void sayHello2() {
        String result = demo2Service.sayHello2("jack");
        System.out.println(result);
    }

}
