package com.sihai.actuator.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AppInfoConfig implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String, String> link = new HashMap<>();
        link.put("site", "https://tsihai.github.io/");
        link.put("site-2", "https://github.com/Tsihai");
        builder.withDetail("link", link);
    }
}


