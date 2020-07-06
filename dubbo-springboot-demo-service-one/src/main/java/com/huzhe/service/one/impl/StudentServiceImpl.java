package com.huzhe.service.one.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huzhe.exception.BusinessException;
import com.huzhe.model.GetStudentsRequest;
import com.huzhe.model.GetStudentsResponse;
import com.huzhe.model.Student;
import com.huzhe.service.StudentService;
import com.huzhe.service.one.mapper.StudentMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    @Qualifier("commonRedisTemplate")
    private RedisTemplate<String, String> commonRedisTemplate;

    @Override
    public Student getById(long id) {
        String key = "student_" + id;
        if (commonRedisTemplate.opsForValue().get(key) != null) {
            String value = commonRedisTemplate.opsForValue().get(key);
            Student student = JSON.parseObject(value, Student.class);
            return student;
        } else {
            Student student = studentMapper.getById(id);
            commonRedisTemplate.opsForValue().set(key, JSON.toJSONString(student));
            return student;
        }
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
        String key = "student_" + student.getId();
        commonRedisTemplate.delete(key);
        studentMapper.updateStudent(student);
        return student;
    }

    @Override
    public GetStudentsResponse getStudents(GetStudentsRequest request) throws BusinessException {
        int age = request.getAge();
        String name = request.getName();
        String ids = request.getIds();
        Map<String, Object> map = new HashMap<>();
        if (age != 0) {
            map.put("age", age);
        }
        if (StringUtils.isNotBlank(name)) {
            map.put("name", name);
        }
        if (StringUtils.isNotBlank(ids)) {
            map.put("idList", ids.split(","));
        }
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<Student> studentList = studentMapper.getStudents(map);
        PageInfo pageInfo = new PageInfo(studentList);

        GetStudentsResponse getStudentsResponse = new GetStudentsResponse();
        getStudentsResponse.setList(studentList);

        //分页信息
        getStudentsResponse.setPageNum(pageInfo.getPageNum());
        getStudentsResponse.setPageSize(pageInfo.getPageSize());
        getStudentsResponse.setPages(pageInfo.getPages());
        getStudentsResponse.setTotal(pageInfo.getTotal());

        return getStudentsResponse;
    }
}
