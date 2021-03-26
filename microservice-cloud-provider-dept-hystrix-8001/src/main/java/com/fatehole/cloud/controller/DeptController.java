package com.fatehole.cloud.controller;

import com.fatehole.cloud.entity.Dept;
import com.fatehole.cloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/19/18:30
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service = null;

    /**
     * 一旦调用服务方法失败并抛出错误信息后，就将自动的调用@HystrixCommand标注好的fallbackMethod调用类进行兜底
     */
    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = this.service.get(id);

        if (null == dept) {
            throw new RuntimeException("该ID:" + id + "没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrixGet(@PathVariable("id") Long id) {
        return new Dept().setDeptNo(id).setDName("该ID:" + id + "没有对应的信息，null--@HystrixCommand")
                .setDbSource("no this database in MySQL");
    }
}
