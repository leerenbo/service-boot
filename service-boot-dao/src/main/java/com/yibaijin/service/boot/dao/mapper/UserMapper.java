package com.yibaijin.service.boot.dao.mapper;

import com.yibaijin.service.boot.dao.model.User;
import com.yibaijin.service.boot.dao.model.UserExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface UserMapper extends BaseMapper<User, UserExample> {
}