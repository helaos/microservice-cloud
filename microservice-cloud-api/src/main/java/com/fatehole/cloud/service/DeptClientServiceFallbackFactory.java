package com.fatehole.cloud.service;

import com.fatehole.cloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/24/23:17
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptNo(id).setDName("该ID:" + id + "没有对应的信息，null--@HystrixCommand")
                        .setDbSource("no this database in MySQL");
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
