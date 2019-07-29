package com.power.rpc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: RpcInvocationHandler
 * @description:
 * @author: doujl
 * @create: 2019-07-22 15:34
 **/
public class RpcInvocationHandler implements InvocationHandler {
    String host;
    int port;

    public RpcInvocationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.setClassName(method.getDeclaringClass().getName());
        rpcRequest.setMethodName(method.getName());
        rpcRequest.setParameter(args);

        RpcTransport rpcTransport = new RpcTransport(host,port);
        return rpcTransport.rpcInvoke(rpcRequest);
    }
}
