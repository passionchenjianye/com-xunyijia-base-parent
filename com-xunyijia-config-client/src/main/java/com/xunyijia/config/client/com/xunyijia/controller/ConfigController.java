package com.xunyijia.config.client.com.xunyijia.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigController.java
 * @Description:
 * @Author: Tony
 * @Date: 2017-04-28 08:41
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${my-config.appName}")
    private String appName;

    @RequestMapping("/app-name")
    public String getAppName() {
        return appName;
    }
}

