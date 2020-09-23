package com.tcwong.service;

import com.alibaba.fastjson.JSONObject;
import com.tcwong.modle.User;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/9/23
 * Since 1.8
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(User user) {
        System.out.println("接收客户端请求->>>>>>" + JSONObject.toJSONString(user));
        return user.getUsername() + ":你好，欢迎加入RPC,你的初始密码是" + user.getPassword();
    }
}
