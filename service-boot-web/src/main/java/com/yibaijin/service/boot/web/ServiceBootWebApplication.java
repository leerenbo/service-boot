package com.yibaijin.service.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.yibaijin")
public class ServiceBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBootWebApplication.class, args);
    }
}
