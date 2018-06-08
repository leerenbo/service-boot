package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.mapper.BaseMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserRoleAssociation;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserRoleAssociationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface AuthUserRoleAssociationMapper extends BaseMapper<AuthUserRoleAssociation,AuthUserRoleAssociationExample> {

    @Select("select auth_role_id from auth_user_role_association where auth_user_id = #{userId}")
    List<Long> selectRoleIdsByUserId(Long userId);
}