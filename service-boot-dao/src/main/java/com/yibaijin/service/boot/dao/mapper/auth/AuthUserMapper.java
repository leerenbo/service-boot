package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.mapper.BaseMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUser;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthUserMapper extends BaseMapper<AuthUser, AuthUserExample> {

    @Select("select * from auth_user where username = #{username}")
    public AuthUser selectByUsername(String username);

}