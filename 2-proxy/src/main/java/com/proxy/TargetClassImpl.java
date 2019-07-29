package com.proxy;

/**
 * @ClassName: TargetClassImpl
 * @description:
 * @author: doujl
 * @create: 2019-07-26 09:36
 **/
public class TargetClassImpl implements TargetClass {


    public String sayHi(String name) throws Exception {
        System.out.println("执行目标方法。。。");
        throw new Exception();
//        return "This is " + name;
    }
}
