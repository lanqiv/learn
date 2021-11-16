package com.itheima.domain;

import lombok.Data;

import javax.persistence.*;


//用户
@Entity(name = "shop_user")//实体类跟数据表对应
//@Table(name = "shop_user")//指定和哪个表数据对应
@Data//不在写get set 方法
public class User {
    @Id//声明主键
    //主键生成策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)//数据库自增长
    private Integer uid;//主键
    private String userName;//名称
    private String password;//密码
    private String telephone;//手机号码




}
