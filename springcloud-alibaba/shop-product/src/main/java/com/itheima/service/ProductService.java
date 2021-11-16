package com.itheima.service;

import com.itheima.domain.Product;

/**
 * service层是有接口的
 * */
public interface ProductService {
    //根据pid查询商品信息
    public Product findByPid(Integer pid);
}
