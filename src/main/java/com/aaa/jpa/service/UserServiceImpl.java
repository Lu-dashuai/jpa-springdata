package com.aaa.jpa.service;

import com.aaa.jpa.entity.User;
import com.aaa.jpa.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;


/**
 * className:UserService
 * discription:
 * author:luRuiHua
 * createTime:2019-01-01 20:27
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserJPA userJPA;

    /**
     * 执行更新或新增方法
     * @param user
     * @return
     */
    @Override
    public User save(User user) {
        return userJPA.save(user);
    }

    /**
     * 分页查询
     * @return
     */
    @Override
    public Page<User> findAll(Pageable pageable) {
        return userJPA.findAll(pageable);
    }
}
