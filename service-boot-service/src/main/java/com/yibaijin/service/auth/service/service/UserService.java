package com.yibaijin.service.auth.service.service;

import com.google.common.collect.Lists;
import com.yibaijin.service.boot.dao.model.auth.RoleAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private AuthUserDetailService authUserDetailService;


    public void regist(String username, String password, String phoneNumber, String code) {
        //todo 校验短信
        User user = new User(username, password, Lists.newArrayList(new RoleAuthority(-1l)));
        authUserDetailService.createUser(user);
    }
}
