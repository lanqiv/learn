package com.itheima.domain;

import lombok.Data;

import javax.persistence.*;

//商品
@Entity(name = "shop_product")
//@Table(name = "shop_product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;

    private String pname;//名称
    private Double pprice;//价格
    private Integer stcok;//库存


}
