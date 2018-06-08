package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.mapper.BaseMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthFunction;
import com.yibaijin.service.boot.dao.model.db.auth.AuthFunctionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface AuthFunctionMapper extends BaseMapper<AuthFunction, AuthFunctionExample> {

    @SelectProvider(type = AuthFunctionMapperProvider.class, method = "selectByIds")
    List<AuthFunction> selectByIds(@Param("ids") List<Long> ids);

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