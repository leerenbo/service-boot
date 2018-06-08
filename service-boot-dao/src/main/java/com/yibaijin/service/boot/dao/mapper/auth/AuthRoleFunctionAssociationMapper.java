package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.mapper.BaseMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthRoleFunctionAssociation;
import com.yibaijin.service.boot.dao.model.db.auth.AuthRoleFunctionAssociationExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface AuthRoleFunctionAssociationMapper extends BaseMapper<AuthRoleFunctionAssociation, AuthRoleFunctionAssociationExample> {

    @SelectProvider(type = AuthRoleFunctionAssociationMapperProvider.class,method = "selectFunctionIdsByRoleIds")
    List<Long> selectFunctionIdsByRoleIds(@Param("roleIds") List<Long> roleIds);

    public static class AuthRoleFunctionAssociationMapperProvider{
        public static String selectFunctionIdsByRoleIds(@Param("roleIds") List<Long> roleIds) {
            return new SQL()
                    .SELECT("auth_function_id")
                    .FROM("auth_role_function_association")
                    .WHERE("auth_role_id in ("+roleIds.stream().map(Object::toString).collect(Collectors.joining(","))+")")
                    .toString();
        }
    }
}