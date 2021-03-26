package com.fatehole.cloud.service;

import com.fatehole.cloud.entity.Dept;

import java.util.List;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/19/18:22
 */
public interface DeptService {
    /**
     * 增加部门
     * @param dept 部门对象
     * @return 成功
     */
    boolean add(Dept dept);
    /**
     * 根据ID查询部门
     * @param id 部门ID
     * @return 部门对象
     */
    Dept get(Long id);
    /**
     * 查询所有的部门信息
     * @return 部门信息的List集合
     */
    List<Dept> list();
}
