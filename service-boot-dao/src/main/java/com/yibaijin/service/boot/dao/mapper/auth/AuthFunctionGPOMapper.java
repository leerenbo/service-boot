package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.mapper.BaseMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthFunctionGPO;
import com.yibaijin.service.boot.dao.model.db.auth.AuthFunctionGPOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface AuthFunctionGPOMapper extends BaseMapper<AuthFunctionGPO, AuthFunctionGPOExample> {

    @SelectProvider(type = AuthFunctionMapperProvider.class, method = "selectByIds")
    List<AuthFunctionGPO> selectByIds(@Param("ids") List<Long> ids);

    public static class AuthFunctionMapperProvider {
        public static String selectByIds(@Param("ids") List<Long> ids) {
            return new SQL()
                    .SELECT("*")
                    .FROM("auth_function")
                    .WHERE("id in (" + ids.stream().map(Object::toString).collect(Collectors.joining(",")) + ")")
                    .toString();
        }
    }
}