package com.itheima.service;

import com.itheima.domain.Order;

/**
 * service层是有接口的
 * */
public interface OrderService {
    //创建订单
    void createOrder(Order order);

}
