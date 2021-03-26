package com.fatehole.cloud.service.impl;

import com.fatehole.cloud.dao.DeptDao;
import com.fatehole.cloud.entity.Dept;
import com.fatehole.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/19/18:23
 */
@Service
public class DeptServiceImpl implements DeptService {

    private final DeptDao deptDao;

    @Autowired
    public DeptServiceImpl(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
