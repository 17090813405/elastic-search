package com.example.elasticsearch.data;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author daizhichao
 * @date 2019/11/14
 */
@Data
@AllArgsConstructor
public class User {
    /**
     * 编号
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private String createtm;
}
