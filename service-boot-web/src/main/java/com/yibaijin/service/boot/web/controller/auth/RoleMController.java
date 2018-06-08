package com.yibaijin.service.boot.web.controller.auth;

import com.yibaijin.service.boot.dao.model.db.auth.AuthRole;
import com.yibaijin.service.boot.web.controller.auth.dto.RoleDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RoleMController {

    @PostMapping("/m/role")
    @PreAuthorize("hasAuthority('/m/role') and hasAnyScope('w')")
    public AuthRole addRole(@RequestBody RoleDTO roleDTO) {

        System.out.println(roleDTO);
        return null;
    }
}
