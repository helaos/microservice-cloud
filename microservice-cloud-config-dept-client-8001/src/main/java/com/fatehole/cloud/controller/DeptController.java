package com.fatehole.cloud.controller;

import com.fatehole.cloud.entity.Dept;
import com.fatehole.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/19/18:30
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    private final DeptService deptService;

    private final DiscoveryClient discoveryClient;

    @Autowired
    public DeptController(DeptService deptService, DiscoveryClient discoveryClient) {
        this.deptService = deptService;
        this.discoveryClient = discoveryClient;
    }

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptService.list();
    }

    @GetMapping("/discovery")
    public Object discovery() {
        List<String> list = discoveryClient.getServices();
        System.out.println("************" + list);
        List<ServiceInstance> instances = this.discoveryClient.getInstances("MICROSERVICE-CLOUD-DEPT");
        instances.forEach(item -> System.out.println(item.getServiceId() + "\t" + item.getHost() + "\t"
                + item.getPort() + "\t" + item.getUri()));
        return this.discoveryClient;
    }

}
