package com.power.rpc.service.impl;

import com.power.model.UserInfo;
import com.power.service.UserService;

import java.util.Date;

/**
 * @ClassName: UserServiceImpl
 * @description:
 * @author: doujl
 * @create: 2019-07-22 16:07
 **/
public class UserServiceImpl implements UserService {
    public String sayHi(String name) {

        System.out.println("invoke sayHi=============");
        return "RPC server-->Hi" + name;
    }

    public UserInfo getUserInfo(Integer id) {

        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setPhone("1380000000");
        userInfo.setBirthDay(new Date());
        return userInfo;
    }
}
