package com.huzhe;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huzhe.exception.BusinessException;
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
        Student student = studentService.getById(1L);
        System.out.println(student);
    }

    @Test
    public void addStudent() {
        Student student = new Student();
        student.setName("lili");
        student.setAge(11);
        Student result = studentService.addStudent(student);
        System.out.println(result);
    }

    @Test
    public void updateStudent() throws BusinessException {
        Student student = new Student();
        student.setName("lili");
        student.setAge(11);
        studentService.updateStudent(student);
        System.out.println("");
    }

}
