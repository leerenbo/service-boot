package com.yibaijin.service.boot.web.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
public class CC {
    @GetMapping("/aaa")
    public String aaa(String aaa) {
        return "aaa";
    }
}
