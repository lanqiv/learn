package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
* 创建微服务
 *     1.创建模块，导入依赖
 *     2.创建SpringBoot主类
 *     3.加入配置文件
 *     4.创建必要的接口和实现类(controller service dao)
* */
@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class);
    }
}
