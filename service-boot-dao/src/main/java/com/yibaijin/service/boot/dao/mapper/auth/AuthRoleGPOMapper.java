package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.mapper.BaseMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthRoleGPO;
import com.yibaijin.service.boot.dao.model.db.auth.AuthRoleGPOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface AuthRoleGPOMapper extends BaseMapper<AuthRoleGPO, AuthRoleGPOExample> {

    @SelectProvider(type = AuthRoleMapperProvider.class, method = "selectByIds")
    List<AuthRoleGPO> selectByIds(@Param("ids") List<Long> ids);//

    public static class AuthRoleMapperProvider {
        public static String selectByIds(List<Long> ids) {//@Param("ids")
            return new SQL()
                    .SELECT("*")
                    .FROM("auth_role")
                    .WHERE("id in (" + ids.stream().map(Object::toString).collect(Collectors.joining(",")) + ")")
                    .toString();
        }
    }
}

