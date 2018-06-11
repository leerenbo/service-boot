package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.mapper.BaseMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserRoleAssociationGPO;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserRoleAssociationGPOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AuthUserRoleAssociationGPOMapper extends BaseMapper<AuthUserRoleAssociationGPO, AuthUserRoleAssociationGPOExample> {

    @Select("select auth_role_id from auth_user_role_association where auth_user_id = #{userId}")
    List<Long> selectRoleIdsByUserId(Long userId);
}