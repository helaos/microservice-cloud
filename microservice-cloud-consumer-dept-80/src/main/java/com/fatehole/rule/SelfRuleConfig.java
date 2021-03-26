package com.fatehole.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/22/17:48
 */
@Configuration
public class SelfRuleConfig {
    @Bean
    public IRule myRule() {
        // Ribbon默认是轮询，自定义为随机
        // return new RandomRule();
        return new RoundRobin5Rule();
    }
}
