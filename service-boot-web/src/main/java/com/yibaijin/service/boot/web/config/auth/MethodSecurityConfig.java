package com.yibaijin.service.boot.web.config.auth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

import java.util.List;

@EnableGlobalMethodSecurity(prePostEnabled = true)
//@Configuration
public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration {
}
