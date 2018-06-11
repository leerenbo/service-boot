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
    private AuthUserGPOMapper authUserGPOMapper;

    @Resource
    private AuthRoleGPOMapper authRoleGPOMapper;

    @Resource
    private AuthUserRoleAssociationGPOMapper authUserRoleAssociationGPOMapper;

    @Resource
    private AuthUserGroupAssociationGPOMapper authUserGroupAssociationGPOMapper;

    @Resource
    private AuthRoleFunctionAssociationGPOMapper authRoleFunctionAssociationMapper;

    @Resource
    private AuthFunctionGPOMapper authFunctionGPOMapper;

    @Resource
    private AuthGroupGPOMapper authGroupGPOMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUserGPO authUserGPO = authUserGPOMapper.selectByUsername(username);
        if (authUserGPO != null) {
            UserFunctionRoleGroupDetails userFunctionRoleGroupDetails = new UserFunctionRoleGroupDetails(authUserGPO.getId(), authUserGPO.getUsername());
            userFunctionRoleGroupDetails.setPassword(authUserGPO.getPassword());

            List<Long> roleIds = authUserRoleAssociationGPOMapper.selectRoleIdsByUserId(authUserGPO.getId());
            List<AuthRoleGPO> authRoleGPOS = authRoleGPOMapper.selectByIds(roleIds);
            userFunctionRoleGroupDetails.setRoleAuthorities(authRoleGPOS.stream().map(authRole -> new RoleAuthority(authRole.getId(), authRole.getName())).collect(Collectors.toList()));

            List<Long> fucntionIds = authRoleFunctionAssociationMapper.selectFunctionIdsByRoleIds(roleIds);
            List<AuthFunctionGPO> authFunctionGPOS = authFunctionGPOMapper.selectByIds(fucntionIds);
            userFunctionRoleGroupDetails.setFunctionAuthorities(authFunctionGPOS.stream().map(authFunction -> new FunctionAuthority(authFunction.getId(), authFunction.getName(), authFunction.getUrl())).collect(Collectors.toList()));

            Long groupId = authUserGroupAssociationGPOMapper.selectGroupIdByUserId(authUserGPO.getId());
            if (groupId != null) {
                AuthGroupGPO authGroupGPO = authGroupGPOMapper.selectByPrimaryKey(groupId);
                if (authGroupGPO != null) {
                    userFunctionRoleGroupDetails.setGroupAuthority(new GroupAuthority(authGroupGPO.getId(), authGroupGPO.getName()));
                }
            }

            return userFunctionRoleGroupDetails;
        } else {
            throw new UsernameNotFoundException(username);
        }
    }

    @Override
    public void createUser(UserDetails user) {
        AuthUserGPO authUserGPO = new AuthUserGPO();
        authUserGPO.setUsername(user.getUsername());
        authUserGPO.setPassword(messageDigestPasswordEncoder.encode(user.getPassword()));
        authUserGPOMapper.insert(authUserGPO);

        user.getAuthorities()
                .stream()
                .filter(g -> g instanceof RoleAuthority)
                .forEach(g -> {
                    AuthUserRoleAssociationGPO authUserRoleAssociationGPO = new AuthUserRoleAssociationGPO();
                    authUserRoleAssociationGPO.setAuthUserId(authUserGPO.getId());
                    authUserRoleAssociationGPO.setAuthRoleId(((RoleAuthority) g).getId());
                    authUserRoleAssociationGPOMapper.insert(authUserRoleAssociationGPO);
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
