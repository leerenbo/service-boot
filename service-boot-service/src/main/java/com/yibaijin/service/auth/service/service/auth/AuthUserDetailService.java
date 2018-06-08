package com.yibaijin.service.auth.service.service.auth;

import com.yibaijin.service.boot.dao.mapper.auth.*;
import com.yibaijin.service.boot.dao.model.auth.FunctionAuthority;
import com.yibaijin.service.boot.dao.model.auth.GroupAuthority;
import com.yibaijin.service.boot.dao.model.auth.RoleAuthority;
import com.yibaijin.service.boot.dao.model.auth.UserFunctionRoleGroupDetails;
import com.yibaijin.service.boot.dao.model.db.auth.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthUserDetailService implements UserDetailsManager {

    public static final MessageDigestPasswordEncoder messageDigestPasswordEncoder = new MessageDigestPasswordEncoder("MD5");

    @Resource
    private AuthUserMapper authUserMapper;

    @Resource
    private AuthRoleMapper authRoleMapper;

    @Resource
    private AuthUserRoleAssociationMapper authUserRoleAssociationMapper;

    @Resource
    private AuthUserGroupAssociationMapper authUserGroupAssociationMapper;

    @Resource
    private AuthRoleFunctionAssociationMapper  authRoleFunctionAssociationMapper;

    @Resource
    private AuthFunctionMapper authFunctionMapper;

    @Resource
    private AuthGroupMapper authGroupMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUser authUser = authUserMapper.selectByUsername(username);
        if (authUser!=null) {
            UserFunctionRoleGroupDetails userFunctionRoleGroupDetails = new UserFunctionRoleGroupDetails(authUser.getId(),authUser.getUsername());
            userFunctionRoleGroupDetails.setPassword(authUser.getPassword());

            List<Long> roleIds=authUserRoleAssociationMapper.selectRoleIdsByUserId(authUser.getId());
            List<AuthRole> authRoles = authRoleMapper.selectByIds(roleIds);
            userFunctionRoleGroupDetails.setRoleAuthorities(authRoles.stream().map(authRole -> new RoleAuthority(authRole.getId(),authRole.getName())).collect(Collectors.toList()));

            List<Long> fucntionIds = authRoleFunctionAssociationMapper.selectFunctionIdsByRoleIds(roleIds);
            List<AuthFunction> authFunctions = authFunctionMapper.selectByIds(fucntionIds);
            userFunctionRoleGroupDetails.setFunctionAuthorities(authFunctions.stream().map(authFunction -> new FunctionAuthority(authFunction.getId(),authFunction.getName(), authFunction.getUrl())).collect(Collectors.toList()));

            Long groupId = authUserGroupAssociationMapper.selectGroupIdByUserId(authUser.getId());
            if (groupId != null) {
                AuthGroup authGroup = authGroupMapper.selectByPrimaryKey(groupId);
                if (authGroup != null) {
                    userFunctionRoleGroupDetails.setGroupAuthority(new GroupAuthority(authGroup.getId(),authGroup.getName()));
                }
            }

            return userFunctionRoleGroupDetails;
        } else {
            throw new UsernameNotFoundException(username);
        }
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
