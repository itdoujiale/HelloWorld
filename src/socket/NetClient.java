package socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @ClassName: NetClient
 * @description:
 * @author: doujl
 * @create: 2019-05-16 15:43
 **/
public class NetClient {
    public static void main(String[] args) {
        Socket client = null;

        // 客户端读取键盘数据的流
        BufferedReader br = null;

        try {
            // 客户端Socket对象创建之后,会立即向服务器发起连接请求
            client = new Socket("172.17.3.212", 5000);

            // 初始化客户端读取键盘数据的流
            br = new BufferedReader(new InputStreamReader(System.in));

            // 客户端要向服务器端发送String格式的数据,客户端要获取OutputStream
            // 为了方便的发送String格式的数据,把OutputStream包装成PrintStream
            OutputStream out = client.getOutputStream();
            PrintStream ps = new PrintStream(out);

            // 读取键盘数据,向服务器端发送
            while (true) {
                String str = br.readLine();

                // 处理空格
                if (str.trim().length() == 0) {
                    continue;
                }

                // 向服务器端发送String格式的数据.注意,发送的时候以\n为标记发送数据
                // 如果客户端向服务器发送的是exit.服务器受到之后也停止接收数据
                ps.println(str);

                // 处理退出
                if ("exit".equalsIgnoreCase(str)) {
                    break;
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            if (e.getMessage().equals("Connection refused: connect")) {
                System.err.println("【客户端提示信息】请确认服务器是否已经启动?");
            } else {
                e.printStackTrace();
            }
        } finally {
            try {
                if (client != null) {
                    client.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
