package com.huzhe;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huzhe.exception.BusinessException;
import com.huzhe.model.GetStudentsRequest;
import com.huzhe.model.GetStudentsResponse;
import com.huzhe.model.Student;
import com.huzhe.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
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

    @Test
    public void getStudents() throws BusinessException {
        GetStudentsRequest getStudentsRequest = new GetStudentsRequest();
        getStudentsRequest.setPageNum(1);
        getStudentsRequest.setPageSize(2);
        GetStudentsResponse getStudentsResponse = studentService.getStudents(getStudentsRequest);
        System.out.println("");
    }

    @Test
    public void sayHello3() {
        Long createdAt1 = Calendar.getInstance().getTimeInMillis();
        System.out.println(createdAt1);
        Long createdAt2 = System.currentTimeMillis();
        System.out.println(createdAt2);
    }

}
