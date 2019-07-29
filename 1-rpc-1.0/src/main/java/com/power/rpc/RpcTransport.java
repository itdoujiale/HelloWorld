package com.power.rpc;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @ClassName: RpcTransport
 * @description:
 * @author: doujl
 * @create: 2019-07-22 15:46
 **/
public class RpcTransport {

    private String host;
    private int port;

    public RpcTransport(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Object rpcInvoke(RpcRequest rpcRequest) {
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Object result = null;

        try {
            socket = new Socket(host, port);

            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(rpcRequest);
            oos.flush();

            ois = new ObjectInputStream(socket.getInputStream());
            result = ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                oos.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return result;
    }
}
