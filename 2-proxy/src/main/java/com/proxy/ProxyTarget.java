package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: ProxyTarget
 * @description:
 * @author: doujl
 * @create: 2019-07-26 09:40
 **/
public class ProxyTarget implements InvocationHandler {
    private TargetClass targetClass;

    public ProxyTarget(TargetClass targetClass) {
        this.targetClass = targetClass;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        Class[] parameterTypes = new Class[args.length];
//
//        for (int i = 0; i < parameterTypes.length; i++) {
//            parameterTypes[i] = args[i].getClass();
//        }
//
//        Method m = targetClass.getClass().getMethod(method.getName(),parameterTypes);

        Object invoke = null;
        try {
            System.out.println("方法执行前....");
            invoke = method.invoke(targetClass, args);
            System.out.println("方法执行后....");
        } catch (Exception e) {
            System.out.println("This invoke catch");
        }
        return invoke;
    }
}
