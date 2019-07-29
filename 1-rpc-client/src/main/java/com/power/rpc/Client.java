package com.power.rpc;

import com.power.model.UserInfo;
import com.power.service.UserService;

/**
 * @ClassName: Client
 * @description:
 * @author: doujl
 * @create: 2019-07-22 15:26
 **/
public class Client {

    public static void main(String[] args) {

        RpcClientProxy rpcClientProxy = new RpcClientProxy();
        UserService userService = rpcClientProxy.getProxy(UserService.class, "127.0.0.1", 30880);



        String doujiale = userService.sayHi("doujiale");
        UserInfo userInfo = userService.getUserInfo(123);
        System.out.println(doujiale);
        System.out.println(userInfo.getPhone());
    }
}
