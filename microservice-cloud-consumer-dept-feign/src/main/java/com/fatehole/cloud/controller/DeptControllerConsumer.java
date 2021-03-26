package com.fatehole.cloud.controller;

import com.fatehole.cloud.entity.Dept;
import com.fatehole.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/19/21:05
 */
@RestController
@RequestMapping("/consumer")
public class DeptControllerConsumer {

    @Autowired
    private DeptClientService service;

    @PostMapping("/dept/add")
    public boolean add(Dept dept) {
        return this.service.add(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return this.service.list();
    }



}
