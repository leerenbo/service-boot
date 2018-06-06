package com.yibaijin.service.boot.web.controller.app;

import com.yibaijin.service.auth.service.service.UserService;
import com.yibaijin.service.boot.web.dto.request.RegistRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    UserService userService;

    @PostMapping("regist")
    public String regist(@RequestBody RegistRequest registRequest) {
        userService.regist(registRequest.getUsername(), registRequest.getPassword(), registRequest.getPhoneNumber(), registRequest.getCode());
        return null;
    }
}
