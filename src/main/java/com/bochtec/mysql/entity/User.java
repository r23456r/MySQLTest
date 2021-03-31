package com.bochtec.mysql.entity;

import lombok.Data;

/**
 * @author: zhangyuhang
 * @modified By：
 * @date ：Created in 2020/6/15 9:14
 **/
@Data
public class User {
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
