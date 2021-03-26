package com.fatehole.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/25/21:24
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527StartSpringCloudApp.class, args);
    }
}
