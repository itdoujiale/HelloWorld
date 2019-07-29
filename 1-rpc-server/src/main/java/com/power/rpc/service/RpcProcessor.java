package com.power.rpc.service;

import com.power.rpc.RpcRequest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * @ClassName: RpcProcessor
 * @description:
 * @author: doujl
 * @create: 2019-07-22 16:34
 **/
public class RpcProcessor implements Runnable {

    private Socket socket;

    private Object serviceImpl;

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public Object getServiceImpl() {
        return serviceImpl;
    }

    public void setServiceImpl(Object serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    public RpcProcessor(Socket socket, Object serviceImpl) {
        this.socket = socket;
        this.serviceImpl = serviceImpl;
    }

    public RpcProcessor(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        ObjectInputStream ois = null;
        ObjectOutputStream oos =null;
        try {
            ois = new ObjectInputStream(socket.getInputStream());
            RpcRequest rpcRequest = (RpcRequest) ois.readObject();

            Object result = this.invokeImp(rpcRequest);

            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(result);
            oos.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
                oos.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public Object invokeImp(RpcRequest rpcRequest) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object[] parameter = rpcRequest.getParameter();
        Class[] parameterTypes = new Class[parameter.length];
        String methodName = rpcRequest.getMethodName();

        for (int i = 0; i < parameterTypes.length; i++) {
            parameterTypes[i] = parameter[i].getClass();
        }

        Method method = serviceImpl.getClass().getMethod(methodName, parameterTypes);
        Object result = method.invoke(serviceImpl, parameter);

        System.out.println("This is a Result :" + result);
        return result;
    }
}
