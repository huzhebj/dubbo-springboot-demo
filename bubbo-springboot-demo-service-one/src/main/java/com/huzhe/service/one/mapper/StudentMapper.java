package com.huzhe.service.one.mapper;

import com.huzhe.model.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    Student getById(long id);
}
