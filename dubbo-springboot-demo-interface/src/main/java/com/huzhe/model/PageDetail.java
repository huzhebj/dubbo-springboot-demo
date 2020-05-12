package com.huzhe.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageDetail implements Serializable {
    private int pageNum;//起始页码
    private int pageSize;//每页的数量
    private int pages;//总页数
    private long total;//总记录数
}
