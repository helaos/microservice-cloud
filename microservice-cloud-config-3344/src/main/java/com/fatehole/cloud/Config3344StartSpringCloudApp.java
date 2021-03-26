package com.fatehole.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/25/22:31
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Config3344StartSpringCloudApp.class, args);
    }
}
