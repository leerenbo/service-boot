package com.yibaijin.service.boot.web.controller;

import com.yibaijin.service.boot.web.dto.TestRequest;
import com.yibaijin.service.boot.web.dto.TestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@Api()
public class Example {

    @PostMapping("a/")
    @ApiOperation(value = "样例接口", tags = "APP1.0", notes = "请求样例")
    public TestResponse a(@RequestBody @Validated TestRequest testRequest, BindingResult bindingResult) {
        if (bindingResult != null) {
            bindingResult.getFieldErrors().forEach(fieldError -> System.out.println(fieldError.getField() + fieldError.getDefaultMessage()));
        }
        TestResponse re = new TestResponse();
        re.setStr("aaaa");
        return re;
    }

    @GetMapping("b/")
    @ApiOperation(value = "样例接口", tags = "APP1.0", notes = "请求样例")
    public TestResponse b(@Validated TestRequest testRequest, BindingResult bindingResult) {
        bindingResult.getFieldErrors().forEach(fieldError -> System.out.println(fieldError.getField() + fieldError.getDefaultMessage()));
        TestResponse re = new TestResponse();
        re.setStr("bbbb");
        return re;
    }

    @GetMapping("c/")
    @ApiOperation(value = "接口",tags = "APP1.1",notes = "请求说明")
    public String c(Long c) {
        return "asdf";
    }


}