package com.huzhe.model;
import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private long id;//学生id
    private String name;//姓名
    private int age;//年龄
}
