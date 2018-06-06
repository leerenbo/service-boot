package com.yibaijin.service.auth.service.service;

import com.yibaijin.service.boot.dao.model.auth.RoleAuthority;
import com.yibaijin.service.boot.dao.mapper.auth.AuthRoleMapper;
import com.yibaijin.service.boot.dao.mapper.auth.AuthUserMapper;
import com.yibaijin.service.boot.dao.mapper.auth.AuthUserRoleAssociationMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUser;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserRoleAssociation;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AuthUserDetailService implements UserDetailsManager {

    public static final MessageDigestPasswordEncoder messageDigestPasswordEncoder = new MessageDigestPasswordEncoder("MD5");

    @Resource
    private AuthUserMapper authUserMapper;

    @Resource
    private AuthRoleMapper authRoleMapper;

    @Resource
    private AuthUserRoleAssociationMapper authUserRoleAssociationMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public void createUser(UserDetails user) {
        AuthUser authUser = new AuthUser();
        authUser.setUsername(user.getUsername());
        authUser.setPassword(messageDigestPasswordEncoder.encode(user.getPassword()));
        authUserMapper.insert(authUser);

        user.getAuthorities()
                .stream()
                .filter(g -> g instanceof RoleAuthority)
                .forEach(g -> {
                    AuthUserRoleAssociation authUserRoleAssociation = new AuthUserRoleAssociation();
                    authUserRoleAssociation.setAuthUserId(authUser.getId());
                    authUserRoleAssociation.setAuthRoleId(((RoleAuthority) g).getId());
                    authUserRoleAssociationMapper.insert(authUserRoleAssociation);
                });
    }

    @Override
    public void updateUser(UserDetails user) {

    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {

    }

    @Override
    public boolean userExists(String username) {
        return false;
    }
}
