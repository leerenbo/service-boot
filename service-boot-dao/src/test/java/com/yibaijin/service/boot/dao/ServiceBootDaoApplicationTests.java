package com.yibaijin.service.boot.dao;

import com.yibaijin.service.boot.dao.mapper.auth.AuthUserGroupAssociationMapper;
import com.yibaijin.service.boot.dao.mapper.auth.AuthUserMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.SQLException;

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

    @Test
    public void test() throws SQLException {


    }


}
