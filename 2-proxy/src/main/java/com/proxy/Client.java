package com.proxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName: Client
 * @description:
 * @author: doujl
 * @create: 2019-07-26 09:38
 **/
public class Client {

    public static void main(String[] args)  {

        try {
            TargetClass target = (TargetClass)Proxy.newProxyInstance(TargetClass.class.getClassLoader(),
                    new Class<?>[]{TargetClass.class},
                    new ProxyTarget(new TargetClassImpl()));


            System.out.println("todo : target.sayHi");
            target.sayHi("doujiale");
            System.out.println("done : target.sayHi");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("This is a Exception!!");
        }
    }

}
