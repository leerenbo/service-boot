package com.yibaijin.service.boot.dao.model.auth;

import org.apache.commons.collections.ListUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserFunctionRoleGroupDetails implements UserDetails {


    private final Long uid;
    private final String username;
    private String password;
    private List<RoleAuthority> roleAuthorities;
    private List<FunctionAuthority> functionAuthorities;
    private GroupAuthority groupAuthority;


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
