package dothread;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.*;

/**
 * @ClassName: TestThread
 * @description:
 * @author: doujl
 * @create: 2019-07-15 10:53
 **/
public class TestThread {

    ThreadPoolExecutor executorService = (ThreadPoolExecutor)Executors.newFixedThreadPool(5);



    @Test
    public void testThread() throws Exception{


        MyCallable m  = new MyCallable();
        Future t=  executorService.submit(m);
        Thread.sleep(10000);
        System.out.println(t.get());

        CountDownLatch countDownLatch = new CountDownLatch(5);
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println("执行开始时间：" + startTime);
        Student student = new Student();
        executorService.execute(() -> {
            student.setName("Lily");
            countDownLatch.countDown();
        });
        executorService.execute(() -> {
            student.setAge(18);
            countDownLatch.countDown();
        });
        executorService.execute(() -> {
            student.setHeight(167L);
            countDownLatch.countDown();
        });
        executorService.execute(() -> {
            student.setWeight(58D);
            countDownLatch.countDown();
        });
        executorService.execute(() -> {
            student.setSex("Girl");
            countDownLatch.countDown();
        });
        countDownLatch.await();
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("执行结束时间：" + endTime);
        System.out.println("执行间隔时间：" + ChronoUnit.MILLIS.between(startTime, endTime) + "ms");
        System.out.println(student);

    }

    @Test
    public void testThread02() throws Exception {

        LocalDateTime startTime = LocalDateTime.now();
        System.out.println("执行开始时间：" + startTime);
        Student student = new Student();
        student.setName("Lily");
        student.setAge(18);
        student.setHeight(167L);
        student.setWeight(58D);
        student.setSex("Girl");
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("执行结束时间：" + endTime);
        System.out.println("执行间隔时间：" + ChronoUnit.MILLIS.between(startTime, endTime) + "ms");
        System.out.println(student);

    }

}
