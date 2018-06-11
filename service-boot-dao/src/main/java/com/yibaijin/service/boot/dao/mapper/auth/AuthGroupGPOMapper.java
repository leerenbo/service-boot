package com.yibaijin.service.boot.dao.mapper.auth;

import com.yibaijin.service.boot.dao.mapper.BaseMapper;
import com.yibaijin.service.boot.dao.model.db.auth.AuthGroupGPO;
import com.yibaijin.service.boot.dao.model.db.auth.AuthGroupGPOExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthGroupGPOMapper extends BaseMapper<AuthGroupGPO,AuthGroupGPOExample> {
}