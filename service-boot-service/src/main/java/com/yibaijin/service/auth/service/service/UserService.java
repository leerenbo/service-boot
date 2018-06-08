package com.yibaijin.service.auth.service.service;

import com.google.common.collect.Lists;
import com.yibaijin.service.auth.service.service.auth.AuthUserDetailService;
import com.yibaijin.service.boot.dao.model.auth.RoleAuthority;
import com.yibaijin.service.boot.dao.model.auth.UserFunctionRoleGroupDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private AuthUserDetailService authUserDetailService;


    public UserFunctionRoleGroupDetails regist(String username, String password, String phoneNumber, String code) {
        //todo 校验短信
        UserFunctionRoleGroupDetails user = new UserFunctionRoleGroupDetails(username, password);
        user.setRoleAuthorities( Lists.newArrayList(new RoleAuthority(-1l)));
        authUserDetailService.createUser(user);
        return user;
    }
}
