package com.fatehole.cloud;

import com.fatehole.rule.SelfRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/19/21:29
 */
@SpringBootApplication
@EnableEurekaClient
// 在启动微服务的时候就能加载自定义Ribbon配置类，从而是配置生效;
// 注意：配置类不能处在@ComponentScan注解扫描的当前包以及子包
@RibbonClient(name = "MICROSERVICE-CLOUD-DEPT", configuration = SelfRuleConfig.class)
public class DeptConsumer80App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80App.class, args);
    }
}
