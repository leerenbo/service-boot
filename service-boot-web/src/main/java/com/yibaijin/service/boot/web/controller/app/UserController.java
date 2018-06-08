package com.yibaijin.service.boot.web.controller.app;

import com.yibaijin.service.auth.service.service.UserService;
import com.yibaijin.service.boot.dao.model.auth.UserFunctionRoleGroupDetails;
import com.yibaijin.service.boot.web.controller.app.dto.RegistRequest;
import org.springframework.validation.annotation.Validated;
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
    public UserFunctionRoleGroupDetails regist(@Validated @RequestBody RegistRequest registRequest) {
       return userService.regist(registRequest.getUsername(), registRequest.getPassword(), registRequest.getPhoneNumber(), registRequest.getCode());
    }

    @PostMapping("logout")
    public String logout() {
        return "logout";
    }


}
