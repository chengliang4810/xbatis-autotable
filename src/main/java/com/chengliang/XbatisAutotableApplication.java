package com.chengliang;

import org.dromara.autotable.springboot.EnableAutoTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoTable
@SpringBootApplication
public class XbatisAutotableApplication {

    public static void main(String[] args) {
        SpringApplication.run(XbatisAutotableApplication.class, args);
    }

}
