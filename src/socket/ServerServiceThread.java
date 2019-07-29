package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @ClassName: ServerServiceThread
 * @description: 1123
 * @author: doujl
 * @create: 2019-05-16 15:41
 **/
public class ServerServiceThread extends Thread {

    private Socket socket;
    private String clientAddr;

    public ServerServiceThread(Socket socket) {
        this.socket = socket;
        this.clientAddr = socket.getInetAddress().getHostAddress();// 初始化客户端的Ip地址
        start();
    }

    public void run() {

        try {
            // 在服务器端要接收客户端发送的String格式的数据,所以要获取分机Socket的InputStream
            // 为了方便的接收String格式的数据,把低级的字节流InputStream包装成BufferedReader
            InputStream in = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            while (true) {
                // 接收数据.注意,接收数据的时候以\n为标记来接收数据
                String str = br.readLine();

                if (str == null) {
                    System.err.println("【服务器提示信息】客户端" + clientAddr
                            + "异常关闭,服务器接收线程停止接收.");
                    break;
                }

                // 处理退出
                if ("exit".equalsIgnoreCase(str)) {
                    System.out.println("【服务器提示信息】客户端" + clientAddr
                            + "要退出了,服务器接收线程停止接收.");
                    break;
                }

                System.out.println("【服务器接收到客户端" + clientAddr + "的信息】" + str);
            }
        } catch (IOException e) {
            if (e.getMessage().equals("Connection reset")) {
                System.err.println("【服务器提示信息】客户端" + clientAddr
                        + "异常关闭,服务器接收线程停止接收.");
            } else {
                e.printStackTrace();
            }
        } finally {
            try {
                // 通讯线程接收的时候,关闭分机
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
