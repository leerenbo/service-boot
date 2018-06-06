package com.yibaijin.service.boot.dao.model.auth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

@Getter
@Setter
@ToString
public class FunctionAuthority implements GrantedAuthority {

    private Long id;
    private String name;

    public FunctionAuthority() {
    }

    public FunctionAuthority(Long id) {
        this.id = id;
    }

    public FunctionAuthority(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return null;
    }
}
