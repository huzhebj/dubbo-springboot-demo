package com.huzhe.model;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GetStudentsResponse extends PageDetail implements Serializable {
    private List<Student> list;//学生列表
}
