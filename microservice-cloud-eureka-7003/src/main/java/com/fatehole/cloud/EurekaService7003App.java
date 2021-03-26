package com.fatehole.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/21/17:57
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaService7003App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7003App.class, args);
    }
}
