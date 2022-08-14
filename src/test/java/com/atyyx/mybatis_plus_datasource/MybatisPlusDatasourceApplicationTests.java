package com.atyyx.mybatis_plus_datasource;


import com.atyyx.mybatis_plus_datasource.service.ProductService;
import com.atyyx.mybatis_plus_datasource.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusDatasourceApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

    @Test
    void contextLoads() {
    }

    @Test
    public void test1()
    {
        System.out.println(userService.getById(2L));
        System.out.println(productService.getById(1L));
    }

}
