package dothread;

/**
 * @ClassName: MyThread
 * @description:
 * @author: doujl
 * @create: 2019-07-23 17:34
 **/
public class MyThread extends Thread {

    private String msg;
    public MyThread(String s) {
        msg = s;
    }
    public void run() {
        long id = Thread.currentThread().getId();
        System.out.println("MyThreadId:"+id);
        System.out.println(msg);
    }

}
