package com.sihai.actuator.config;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.boot.web.server.Http2;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 配置拦截请求，拦截所有端点
        http.requestMatcher(EndpointRequest.toAnyEndpoint())
                // 授权请求
                .authorizeRequests()
                // 设置权限
                .anyRequest().hasRole("ADMIN")
                .and()
                // 登陆方式
                .httpBasic()
                .and()
                // 禁用 csrf
                .csrf().disable();
    }
}
