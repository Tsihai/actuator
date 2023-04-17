package com.sihai.actuator.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthConfig implements HealthIndicator {
    @Override
    public Health health() {
//        return Health.status("FATAL").withDetail("msg", "发现严重问题").build();
         return Health.up().withDetail("msg", "正常").build();
    }
}
