package com.yibaijin.service.boot.dao.model.auth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

@Getter
@Setter
@ToString
public class FunctionAuthority implements GrantedAuthority {

    private static final long serialVersionUID = 2679482073950433895L;

    private Long id;
    private String name;
    private String url;

    public FunctionAuthority() {
    }

    public FunctionAuthority(Long id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    @Override
    public String getAuthority() {
        return url;
    }
}
