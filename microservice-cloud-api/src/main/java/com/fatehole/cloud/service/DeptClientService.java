package com.fatehole.cloud.service;

import com.fatehole.cloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/22/22:33
 */
@RequestMapping("/dept")
// @FeignClient("MICROSERVICE-CLOUD-DEPT")
@FeignClient(value = "MICROSERVICE-CLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    /**
     * 调用远程增加部门
     * @param dept 部门对象
     * @return 成功
     */
    @PostMapping("/add")
    boolean add(@RequestBody Dept dept);

    /**
     * 调用远程根据ID查询部门
     * @param id 部门ID
     * @return 部门对象
     */
    @GetMapping("/get/{id}")
    Dept get(@PathVariable("id") Long id);

    /**
     * 调用远程查询所有的部门信息
     * @return 部门信息的List集合
     */
    @GetMapping("/list")
    List<Dept> list();
}
