package com.huzhe.service.one.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.huzhe.exception.BusinessException;
import com.huzhe.model.Student;
import com.huzhe.service.StudentService;
import com.huzhe.service.one.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getById(long id) {
        return studentMapper.getById(id);
    }

    @Override
    public Student addStudent(Student student) {
        studentMapper.addStudent(student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) throws BusinessException {
        if(student.getId() <= 0){
            throw new BusinessException(101,"学生id不能为空");
        }
        studentMapper.updateStudent(student);
        return student;
    }
}
