package com.yibaijin.service.boot.web.controller.app.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class RegistRequest {

    @NotNull(message = "账号不能为空")
    @Length(min = 6,max = 32,message = "账号长度为6-32位")
    private String username;
    @NotNull(message = "密码不能为空")
    private String password;
    private String phoneNumber;
    private String code;

}
