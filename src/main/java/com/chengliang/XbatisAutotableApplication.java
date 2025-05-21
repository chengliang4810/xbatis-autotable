package com.chengliang;

import org.dromara.autotable.springboot.EnableAutoTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 是否开启自动生成表
@EnableAutoTable
@SpringBootApplication
public class XbatisAutotableApplication {

    public static void main(String[] args) {
        SpringApplication.run(XbatisAutotableApplication.class, args);
    }

}
