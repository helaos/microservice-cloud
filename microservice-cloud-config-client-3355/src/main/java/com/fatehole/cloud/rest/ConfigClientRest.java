package com.fatehole.cloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/25/23:30
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String config() {
        String str = "applicationName: " + applicationName + "\t eurekaServers: " + eurekaServers +
                "\t port: " + port;
        System.out.println("*******str: " + str);
        return str;
    }

}
