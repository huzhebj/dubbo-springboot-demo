package com.huzhe;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huzhe.model.Student;
import com.huzhe.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Reference
    private StudentService studentService;

    @Test
    public void getById() {
        Student student = studentService.getById(2L);
        System.out.println(student);
    }

}
