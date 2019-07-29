import org.I0Itec.zkclient.ZkClient;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: AbstractZookeeperLock
 * @description:
 * @author: doujl
 * @create: 2019-07-29 10:54
 **/
public abstract class AbstractZookeeperLock implements ZookeeperLock {
    protected String lock;
    protected String ipAddress = "127.0.0.1:2181";
    protected ZkClient ZkClient = new ZkClient(ipAddress);
    protected CountDownLatch countDownLatch;

    public final void lock() {
        if (tryLock()) {
            System.out.println("获取锁成功");
        } else {
            waitLock();
        }
        lock();

    }


    public final void unLock() {
        if (ZkClient != null) {
            ZkClient.close();
            System.out.println("解锁成功。。。");
        }

    }

    protected abstract void waitLock();

    protected abstract boolean tryLock();

}
