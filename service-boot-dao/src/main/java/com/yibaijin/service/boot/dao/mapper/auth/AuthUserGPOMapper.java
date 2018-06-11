package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.mapper.BaseMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserGPO;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserGPOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthUserGPOMapper extends BaseMapper<AuthUserGPO, AuthUserGPOExample> {

    @Select("select * from auth_user where username = #{username}")
    public AuthUserGPO selectByUsername(String username);

}