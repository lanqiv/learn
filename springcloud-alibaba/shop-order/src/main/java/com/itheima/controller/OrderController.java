package com.itheima.controller;

import com.alibaba.fastjson.JSON;
import com.itheima.dao.OrderDao;
import com.itheima.domain.Order;
import com.itheima.domain.Product;
import com.itheima.service.OrderService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@Data
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderDao orderDao;

    @RequestMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid){
        log.info("接受到{}号商品的下单请求，接下来调用商品微服务查询此商品信息",pid);
        //调用查询商品的微服务
        //问题
        //1.服务提供者的地址信息变化了，就要跟着去修改消费者代码
        //2.一旦服务做了集群，服务调用方无法实现负载均衡
        //3.一旦微服务变的越来越多，如何管理这个服务清单就成了问题
        Product product =
                restTemplate.getForObject("http://localhost:8082/product/"+pid,Product.class);
        log.info("查询到{}号商品的信息，内容是:{}",pid, JSON.toJSONString(product));
        //下单(创建订单)
        Order order = new Order();
        order.setPid(pid);
        order.setPName(product.getPname());
        order.setNumber(1);
        order.setUserName("测试用户");
        order.setUid(1);
        order.setPPrice(product.getPprice());
        //创建订单
        orderService.createOrder(order);

        log.info("创建订单成功，订单信息为{}",JSON.toJSONString(order));



        return order;
    }
}
