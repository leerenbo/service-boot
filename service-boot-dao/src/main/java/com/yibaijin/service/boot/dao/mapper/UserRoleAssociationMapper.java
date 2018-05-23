package com.yibaijin.service.boot.dao.mapper;

import com.yibaijin.service.boot.dao.model.UserRoleAssociation;
import com.yibaijin.service.boot.dao.model.UserRoleAssociationExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface UserRoleAssociationMapper extends BaseMapper<UserRoleAssociation, UserRoleAssociationExample> {
}