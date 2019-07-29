import org.I0Itec.zkclient.IZkDataListener;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: ZookeeperDistrustImpl
 * @description:
 * @author: doujl
 * @create: 2019-07-29 11:13
 **/
public class ZookeeperDistrustLock extends AbstractZookeeperLock {

    public ZookeeperDistrustLock(String lockName) {
        lock = lockName;
    }

    protected void waitLock() {

        IZkDataListener listener = new IZkDataListener() {
            public void handleDataChange(String s, Object o) throws Exception {

            }

            public void handleDataDeleted(String s) throws Exception {
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        };

        ZkClient.subscribeDataChanges(lock, listener);
        if (ZkClient.exists(lock)) {
            countDownLatch = new CountDownLatch(1);
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ZkClient.unsubscribeDataChanges(lock, listener);

    }

    protected boolean tryLock() {
        try {
            ZkClient.createEphemeral(lock);
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }
}
