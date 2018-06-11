package com.yibaijin.service.boot.web.controller.app;

import com.yibaijin.service.auth.service.service.UserService;
import com.yibaijin.service.boot.dao.model.auth.UserFunctionRoleGroupDetails;
import com.yibaijin.service.boot.web.controller.app.dto.RegistRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
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

    @Autowired
    AuthorizationServerTokenServices authorizationServerTokenServices;

    @PostMapping("regist")
    public UserFunctionRoleGroupDetails regist(@Validated @RequestBody RegistRequest registRequest) {
       return userService.regist(registRequest.getUsername(), registRequest.getPassword(), registRequest.getPhoneNumber(), registRequest.getCode());
    }

    @PostMapping("logout")
    public String logout(OAuth2Authentication oAuth2Authentication) {
        if (authorizationServerTokenServices instanceof DefaultTokenServices) {
            ((DefaultTokenServices)authorizationServerTokenServices).revokeToken(((OAuth2AuthenticationDetails)oAuth2Authentication.getDetails()).getTokenValue());
        }
        return "logout";
    }

}
