package com.yibaijin.service.boot.web.controller.app;

import com.yibaijin.service.boot.web.ServiceBootWebApplication;
import com.yibaijin.service.boot.web.ServiceBootWebApplicationTests;
import com.yibaijin.service.boot.web.dto.request.RegistRequest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

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