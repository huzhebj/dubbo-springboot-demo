package com.huzhe.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huzhe.model.Student;
import com.huzhe.service.StudentService;
import org.springframework.web.bind.annotation.*;

/**
 * DemoConsumerController
 * 消费者控制层
 */
@RestController
public class StudentController {

    @Reference
    private StudentService studentService;

    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    public Student getById(@PathVariable("id") long id) {
        return studentService.getById(id);
    }

}
