package com.atyyx.mybatis_plus_datasource.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author yyx
 * @version 1.0
 * @date 2022/8/14 0:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("product")
public class Product {
    @TableId
    private Long id;
    @TableField
    private String name;
    @TableField
    private Integer price;
    @Version
    private Integer version;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
