package com.yibaijin.service.boot.dao.model.auth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

@Getter
@Setter
@ToString
public class GroupAuthority implements GrantedAuthority {

    private Long id;
    private String name;

    public GroupAuthority() {
    }

    public GroupAuthority(Long id) {
        this.id = id;
    }

    public GroupAuthority(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }
}
