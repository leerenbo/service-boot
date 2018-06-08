package com.yibaijin.service.boot.dao.model.auth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

@Getter
@Setter
@ToString
public class RoleAuthority implements GrantedAuthority {

    private static final long serialVersionUID = 8153508364872175587L;

    private Long id;
    private String name;

    public RoleAuthority() {
    }

    public RoleAuthority(Long id) {
        this.id = id;
    }

    public RoleAuthority(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }
}
