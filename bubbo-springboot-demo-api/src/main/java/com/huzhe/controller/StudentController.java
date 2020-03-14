package com.huzhe.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huzhe.exception.BusinessException;
import com.huzhe.model.Student;
import com.huzhe.service.StudentService;
import com.huzhe.util.DataUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * StudentController
 * 消费者控制层
 */
@RestController
public class StudentController {

    @Reference
    private StudentService studentService;

    //根据id查学生信息
    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    public Map<String, Object> getById(@PathVariable("id") long id) {
        Student student = studentService.getById(id);
        return DataUtil.sendResponse(200, "", student);
    }

    //添加学生
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public Map<String, Object> addStudent(@RequestParam String name,
                                          @RequestParam int age
    ) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        Student dbStudent = studentService.addStudent(student);
        return DataUtil.sendResponse(200, "", dbStudent);
    }

    //修改学生
    @RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
    public Map<String, Object> updateStudent(@RequestParam long id,
                                             @RequestParam String name,
                                             @RequestParam int age
    ) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        try {
            studentService.updateStudent(student);
        } catch (BusinessException e) {
            e.printStackTrace();
            return DataUtil.sendResponse(e.getCode(), e.getMessage(), null);
        }
        return DataUtil.sendResponse(200, "", null);
    }

}
