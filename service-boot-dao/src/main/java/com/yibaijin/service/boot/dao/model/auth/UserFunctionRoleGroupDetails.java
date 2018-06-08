package com.yibaijin.service.boot.dao.model.auth;

import lombok.Getter;
import org.apache.commons.collections.ListUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


@RedisHash(value = "auth_userDetails",timeToLive = 1800L)
@Getter
public class UserFunctionRoleGroupDetails implements UserDetails {

    private Long uid;
    @Id
    private String username;
    private String password;
    private List<RoleAuthority> roleAuthorities = Collections.emptyList();
    private List<FunctionAuthority> functionAuthorities = Collections.emptyList();
    private GroupAuthority groupAuthority;

    public UserFunctionRoleGroupDetails() {
    }

    public Long getUid() {
        return uid;
    }

    public List<RoleAuthority> getRoleAuthorities() {
        return roleAuthorities;
    }

    public void setRoleAuthorities(List<RoleAuthority> roleAuthorities) {
        this.roleAuthorities = roleAuthorities;
    }

    public List<FunctionAuthority> getFunctionAuthorities() {
        return functionAuthorities;
    }

    public void setFunctionAuthorities(List<FunctionAuthority> functionAuthorities) {
        this.functionAuthorities = functionAuthorities;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GroupAuthority getGroupAuthority() {
        return groupAuthority;
    }

    public void setGroupAuthority(GroupAuthority groupAuthority) {
        this.groupAuthority = groupAuthority;
    }

    public UserFunctionRoleGroupDetails(Long uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    public UserFunctionRoleGroupDetails(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return ListUtils.union(roleAuthorities, functionAuthorities);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
