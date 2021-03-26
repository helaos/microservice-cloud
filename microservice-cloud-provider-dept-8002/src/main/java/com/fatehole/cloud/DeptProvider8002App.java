package com.fatehole.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/19/18:38
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class DeptProvider8002App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002App.class, args);
    }

}
