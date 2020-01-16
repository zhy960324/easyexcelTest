package com.zhy.easyexceldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.zhy.easyexceldemo.config","com.zhy"})
public class EasyexceldemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyexceldemoApplication.class, args);
    }

}
