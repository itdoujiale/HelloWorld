package com.power.rpc.service;

import com.sun.corba.se.impl.presentation.rmi.ExceptionHandler;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: RpcServer
 * @description:
 * @author: doujl
 * @create: 2019-07-22 16:27
 **/
public class RpcServer {

    public void publish(Object serviceObject,int port) {

        try {
            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {

                Socket socket = serverSocket.accept();
                new Thread(new RpcProcessor(socket, serviceObject)).start();
            }


        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
