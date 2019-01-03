package com.aaa.jpa.jpa;

import com.aaa.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * className:UserJPA
 * discription:
 * author:luRuiHua
 * createTime:2019-01-01 20:29
 */
public interface UserJPA extends JpaRepository<User,Long>{

}
