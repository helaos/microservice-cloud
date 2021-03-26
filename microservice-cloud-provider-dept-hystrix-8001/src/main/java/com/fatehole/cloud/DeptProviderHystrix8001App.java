package com.fatehole.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/19/18:38
 */
@EnableEurekaClient
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class DeptProviderHystrix8001App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix8001App.class, args);
    }
}
