//package com.yibaijin.service.boot.web.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import javax.sql.DataSource;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/oauth/**").authenticated().and().csrf()
//                .requireCsrfProtectionMatcher(new AntPathRequestMatcher("/oauth/authorize")).disable().formLogin()
//                .permitAll().and().logout().permitAll().and();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .withUser("user").password("password").roles("USER");
////        User.UserBuilder users = User.withDefaultPasswordEncoder();
////        AuthenticationProvider authenticationProvider=new A;
////        auth
////                .authenticationProvider(authenticationProvider).jdbcAuthentication()
////                .dataSource(dataSource)
////                .withDefaultSchema()
////                .withUser(users.username("user").password("password").roles("USER"))
////                .withUser(users.username("admin").password("password").roles("USER","ADMIN"));
//
//    }
//
//}
