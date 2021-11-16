package com.itheima.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Person")
@Data
public class Person {

    @Id
    private long personid;

    private String firtname;
    private String lastName;
    private String Email;
}
