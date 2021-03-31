package com.bochtec.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan(basePackages = {"com.bochtec.mysql.dao"})
@SpringBootApplication
@EnableScheduling
public class MysqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(MysqlApplication.class, args);
    }
}