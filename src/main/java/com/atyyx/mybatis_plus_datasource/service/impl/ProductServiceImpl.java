package com.atyyx.mybatis_plus_datasource.service.impl;

import com.atyyx.mybatis_plus_datasource.mapper.ProductMapper;
import com.atyyx.mybatis_plus_datasource.pojo.Product;
import com.atyyx.mybatis_plus_datasource.service.ProductService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author yyx
 * @version 1.0
 * @date 2022/8/14 0:54
 */
@Service
@DS("slave_1")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
