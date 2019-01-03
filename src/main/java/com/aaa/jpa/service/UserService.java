package com.aaa.jpa.service;

import com.aaa.jpa.entity.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * className:UserService
 * discription:
 * author:luRuiHua
 * createTime:2019-01-01 20:27
 */
public interface UserService {
    /**
     * 执行更新或添加方法
     * @return
     */
    User save(User user);
    /**
     * 查询方法
     */
    Page<User> findAll(Pageable pageable);
}
