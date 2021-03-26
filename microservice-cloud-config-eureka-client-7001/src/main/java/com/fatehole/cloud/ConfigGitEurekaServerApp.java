package com.fatehole.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/26/10:16
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigGitEurekaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigGitEurekaServerApp.class, args);
    }
}
