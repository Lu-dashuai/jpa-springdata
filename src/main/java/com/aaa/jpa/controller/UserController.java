package com.aaa.jpa.controller;

import com.aaa.jpa.entity.User;
import com.aaa.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * className:UserController
 * discription:
 * author:luRuiHua
 * createTime:2019-01-01 20:27
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 执行新增或者更新方法
     * @param user
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public User save(@RequestBody User user){
        System.out.println("姓名："+user.getName());
        return userService.save(user);
    }
    /**
     * 分页查询
     */
    @RequestMapping("/page")
    @ResponseBody
    public Object findAll(@RequestBody Map map) {
        int pageNo = Integer.valueOf(map.get("pageNo")+"");
        int pageSize = Integer.valueOf(map.get("pageSize")+"");
        PageRequest pageRequest = PageRequest.of(pageNo-1,pageSize);
        Page<User> all = userService.findAll(pageRequest);
        return all;
    }

    /**
     * 跳转user.html
     */
    @RequestMapping("/toUser")
    public String toUser(){
        return "user";
    }
}
