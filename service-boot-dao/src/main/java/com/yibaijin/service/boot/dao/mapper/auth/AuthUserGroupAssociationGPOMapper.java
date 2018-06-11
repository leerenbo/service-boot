package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.mapper.BaseMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserGroupAssociationGPO;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserGroupAssociationGPOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthUserGroupAssociationGPOMapper extends BaseMapper<AuthUserGroupAssociationGPO, AuthUserGroupAssociationGPOExample> {
    @Select("select * from auth_user_group_association where auth_user_id = #{id}")
    Long selectGroupIdByUserId(Long id);
}