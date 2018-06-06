package com.yibaijin.service.boot.web.dto.request;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegistRequest {

    private String username;
    private String password;
    private String phoneNumber;
    private String code;

}
