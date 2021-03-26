package com.fatehole.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/25/20:58
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashBoardApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashBoardApp.class, args);
    }
}
