package com.huzhe.model;
import lombok.Data;

import java.io.Serializable;

@Data
public class GetStudentsRequest implements Serializable {
    private String ids;//学生ids
    private String name;//姓名
    private int age;//年龄
    private int pageNum;//起始页码
    private int pageSize;//每页的数量
}
