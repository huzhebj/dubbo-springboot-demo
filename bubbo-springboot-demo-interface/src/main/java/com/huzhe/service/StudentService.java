package com.huzhe.service;

import com.huzhe.exception.BusinessException;
import com.huzhe.model.Student;

public interface StudentService {
    Student getById(long id);
    Student addStudent(Student student);
    Student updateStudent(Student student) throws BusinessException;
}
