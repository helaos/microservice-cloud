package com.fatehole.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/19/21:29
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.fatehole.cloud"})
public class DeptConsumerFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeignApp.class, args);
    }
}
