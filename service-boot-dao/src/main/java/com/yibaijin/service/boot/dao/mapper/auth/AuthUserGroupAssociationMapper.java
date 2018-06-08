package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.mapper.BaseMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserGroupAssociation;
import com.yibaijin.service.boot.dao.model.db.auth.AuthUserGroupAssociationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface AuthUserGroupAssociationMapper extends BaseMapper<AuthUserGroupAssociation,AuthUserGroupAssociationExample> {
    @Select("select * from auth_user_group_association where auth_user_id = #{id}")
    Long selectGroupIdByUserId(Long id);
}