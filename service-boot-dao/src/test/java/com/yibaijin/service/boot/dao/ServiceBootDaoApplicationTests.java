package com.yibaijin.service.boot.dao;

import com.yibaijin.service.boot.dao.mapper.UserMapper;
import com.yibaijin.service.boot.dao.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceBootDaoApplicationTests {

    @Resource
    UserMapper userMapper;

    @Test
    public void test() throws SQLException {
        User user=new User().withUsername("admin").withPassword("admin");
        userMapper.insert(user);
        System.out.println(user.getId());
    }

}
