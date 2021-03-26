package com.fatehole.cloud.controller;

import com.fatehole.cloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/19/21:05
 */
@RestController
@RequestMapping("/consumer")
public class DeptControllerConsumer {

    // private static final String REST_URL_PREFIX = "http://localhost:8001";

    private static final String REST_URL_PREFIX = "http://MICROSERVICE-CLOUD-DEPT";

    /**
     * 使用 RestTemplate 访问 restful 接口非常的简单粗暴无脑
     * url: Rest 请求地址
     * requestMap: 请求参数
     * ResponseBean.class: HTTP响应转换成对象
     */
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    /**
     * 测试@EnableDiscoveryClient，消费端可以调用服务发现
     */
    @GetMapping("/dept/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }
}
