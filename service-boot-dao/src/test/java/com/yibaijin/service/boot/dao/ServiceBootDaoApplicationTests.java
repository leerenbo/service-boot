package com.yibaijin.service.boot.dao;

import com.google.common.collect.Lists;
import com.yibaijin.service.boot.dao.mapper.auth.AuthRoleMapper;
import com.yibaijin.service.boot.dao.mapper.auth.AuthUserMapper;
import com.yibaijin.service.boot.dao.model.auth.UserFunctionRoleGroupDetails;
import com.yibaijin.service.boot.dao.model.db.auth.AuthRole;
import com.yibaijin.service.boot.dao.redis.UserFunctionRoleGroupDetailsRedisRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceBootDaoApplicationTests {

    @Resource
    AuthUserMapper authUserMapper;

    @Resource
    RedisTemplate<String,String> redisTemplate;

    @Resource
    RedisConnectionFactory redisConnectionFactory;

    Logger logger = LogManager.getLogger();

    @Autowired
    UserFunctionRoleGroupDetailsRedisRepository userFunctionRoleGroupDetailsRedisRepository;

    @Resource
    AuthRoleMapper roleMapper;

    @Test
    public void test() throws SQLException {
//        UserFunctionRoleGroupDetails userFunctionRoleGroupDetails = new UserFunctionRoleGroupDetails( 1l,"123");
//        userFunctionRoleGroupDetailsRedisRepository.save(userFunctionRoleGroupDetails);

        List<AuthRole> authRoles = roleMapper.selectByIds(Lists.newArrayList(-1l));

        System.out.println(authRoles.size());
    }


}
