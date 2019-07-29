package com.power.rpc;

import com.power.rpc.service.RpcServer;
import com.power.rpc.service.impl.UserServiceImpl;
import com.power.service.UserService;

/**
 * @ClassName: Server
 * @description:
 * @author: doujl
 * @create: 2019-07-22 16:03
 **/
public class Server {
    public static void main(String[] args) {

        RpcServer rpcServer = new RpcServer();
        rpcServer.publish(new UserServiceImpl(),30880);
    }
}
