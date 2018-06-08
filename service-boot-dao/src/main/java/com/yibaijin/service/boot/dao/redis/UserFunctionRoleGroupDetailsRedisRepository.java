package com.yibaijin.service.boot.dao.redis;

import com.yibaijin.service.boot.dao.model.auth.UserFunctionRoleGroupDetails;
import org.springframework.data.repository.CrudRepository;

public interface UserFunctionRoleGroupDetailsRedisRepository extends CrudRepository<UserFunctionRoleGroupDetails,String> {
}
