package com.yibaijin.service.auth.service.service.auth;

import com.yibaijin.service.boot.dao.model.auth.UserFunctionRoleGroupDetails;
import com.yibaijin.service.boot.dao.redis.UserFunctionRoleGroupDetailsRedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserCache;
import org.springframework.security.core.userdetails.UserDetails;

public class RedisUserCache implements UserCache {

    @Autowired
    UserFunctionRoleGroupDetailsRedisRepository userFunctionRoleGroupDetailsRedisRepository;

    @Override
    public UserDetails getUserFromCache(String username) {
        return userFunctionRoleGroupDetailsRedisRepository.findById(username).orElse(null);
    }

    @Override
    public void putUserInCache(UserDetails user) {
        if (user instanceof UserFunctionRoleGroupDetails) {
            userFunctionRoleGroupDetailsRedisRepository.save((UserFunctionRoleGroupDetails)user);
        }
    }

    @Override
    public void removeUserFromCache(String username) {
        userFunctionRoleGroupDetailsRedisRepository.deleteById(username);
    }
}
