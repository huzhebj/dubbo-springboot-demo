package com.huzhe.service.one.mapper;

import com.huzhe.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    Student getById(long id);
    void addStudent(Student student);
    void updateStudent(Student student);
    List<Student> getStudents(Map<String,Object> map);
}
