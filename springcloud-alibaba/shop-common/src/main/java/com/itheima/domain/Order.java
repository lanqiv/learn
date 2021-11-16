package com.itheima.domain;

import lombok.Data;

import javax.persistence.*;


//订单
@Entity(name="shop_order")
//@Table(name="shop_order")//指定和哪个表数据对应
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long oid;

    //用户信息
    private Integer uid;//用户id
    private String userName;//用户名称
    //商品信息
    private Integer pid;//商品id
    private String pName;//商品名称
    private Double pPrice;//商品价格

    private Integer number;//购买数量

}
