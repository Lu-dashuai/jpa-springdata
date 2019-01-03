package com.aaa.jpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * className:User
 * discription:
 * author:luRuiHua
 * createTime:2019-01-01 20:03
 */
@Entity
@Table(name="t_user")
@Data
public class User {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        @Column(name = "t_id")//id
        private Long id;
        @Column(name = "t_name")//name
        private String name;
        @Column(name = "t_age")//age
        private String age;
        @Column(name = "t_address")//address
        private String address;
}
