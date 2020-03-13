package com.huzhe.service.one.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
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
}
