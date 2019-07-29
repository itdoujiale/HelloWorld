package com.power.rpc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName: RpcClientProxy
 * @description:
 * @author: doujl
 * @create: 2019-07-22 15:30
 **/
public class RpcClientProxy {

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class interfaceClass, String host, int port) {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(),
                new Class<?>[]{interfaceClass},
                new RpcInvocationHandler(host, port));
    }
}
