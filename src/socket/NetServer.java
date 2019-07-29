package socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: NetServer
 * @description: sockettest
 * @author: doujl
 * @create: 2019-05-16 15:39
 **/
public class NetServer {
    public static void main(String[] args) {
        ServerSocket server = null;

        try {
            // ServerSocket对象创建好之后,立即处于监听状态,等待客户端的链接
            server = new ServerSocket(5001);
            System.out.println("【服务器提示信息】服务器已经启动,等待客户端的连接......");

            while (true) {
                // 当没有客户端连接的时候,server.accept()方法会使程序进入阻塞状态
                // 当有客户端链接的时候,server.accept()方法会解除阻塞,并且返回一个和客户端连接的分机Socket
                Socket socket = server.accept();

                // 总机把客户端的信息传递给了分机Socket,我们可以通过分分机Socket获取客户端的信息
                InetAddress iAddr = socket.getInetAddress();
                String clientAddr = iAddr.getHostAddress();

                System.out.println("【服务器提示信息】服务器接收客户端" + clientAddr + "的连接.");

                // 当服务器总机接收到客户端链接并且返回和客户端链接的分机Socket,服务器端应该创建通讯线程
                // 让客户端Socket和分机Socket在线程中通讯.而服务器总机返回监听状态
                ServerServiceThread sst = new ServerServiceThread(socket);

            }
        } catch (IOException e) {
            if (e.getMessage().equals("Address already in use: JVM_Bind")) {
                System.err.println("【服务器提示信息】目标端口已经被占用,请确认!");
            } else {
                e.printStackTrace();
            }
        } finally {
            try {
                if (server != null) {
                    server.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
