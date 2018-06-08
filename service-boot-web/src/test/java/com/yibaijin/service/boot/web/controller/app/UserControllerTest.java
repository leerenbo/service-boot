package com.yibaijin.service.boot.web.controller.app;

import com.yibaijin.service.boot.web.ServiceBootWebApplicationTests;
import com.yibaijin.service.boot.web.controller.app.dto.RegistRequest;
import org.junit.Test;

import javax.annotation.Resource;

public class UserControllerTest extends ServiceBootWebApplicationTests {

    @Resource
    UserController userController;

    @Test
    public void regist() {
        RegistRequest registRequest = new RegistRequest();
        registRequest.setUsername("lirenbo");
        registRequest.setPassword("123");
        userController.regist(registRequest);
    }

}