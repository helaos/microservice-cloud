package com.fatehole.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author helaos
 * @version 1.0.0
 * @date Create in 2021/03/18/22:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    /**
     * 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String dName;
    /**
     * 来自那个数据库，因为微服务架构可以一个服务对应一个数据库
     */
    private String dbSource;

    public Dept(String dName) {
        this.dName = dName;
    }
}
