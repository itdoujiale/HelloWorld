package dothread;

/**
 * @ClassName: TestRunnable
 * @description:
 * @author: doujl
 * @create: 2019-07-23 17:25
 **/
public class TestRunnable implements Runnable {
    @Override
    public void run() {

        long id = Thread.currentThread().getId();
        System.out.println("分支id:" + id);
        System.out.println("this is runnable");
    }
}
