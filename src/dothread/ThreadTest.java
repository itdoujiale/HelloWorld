package dothread;

import org.junit.Test;

import java.util.concurrent.Callable;

/**
 * @ClassName: ThreadTest
 * @description:
 * @author: doujl
 * @create: 2019-07-23 17:24
 **/
public class ThreadTest {

    @Test
    public void test01(){

        MyThread t = new MyThread("this is thread");
        t.start();

        long id = Thread.currentThread().getId();
        System.out.println("mainId:" + id);
        TestRunnable testRunnable = new TestRunnable();


        testRunnable.run();

        Runnable r = () -> {
            System.out.println("this ====");
        };
        r.run();
    }
}
