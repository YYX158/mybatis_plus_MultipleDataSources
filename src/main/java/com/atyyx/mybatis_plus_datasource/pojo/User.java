package com.atyyx.mybatis_plus_datasource.pojo;

import com.atyyx.mybatis_plus_datasource.Enum.Sex;
import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author yyx
 * @version 1.0
 * @date 2022/8/14 0:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("user")
public class User {
    @TableId
    private Long id;
    @TableField
    private String name;
    @TableField
    private Integer age;
    @TableField
    private String email;
    @TableLogic
    private Integer isDelete;

    private Sex sex;

    public User(String name, Integer age, String email, Sex sex) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.sex = sex;
    }
}
