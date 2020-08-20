package com.huarui.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huarui.mybatisplus.mapper")
public class SbMybatisPlus3Application {

    public static void main(String[] args) {
        SpringApplication.run(SbMybatisPlus3Application.class, args);
    }

}
