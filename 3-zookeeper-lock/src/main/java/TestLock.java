/**
 * @ClassName: TestLock
 * @description:
 * @author: doujl
 * @create: 2019-07-29 11:26
 **/
public class TestLock {

    public static void main(String[] args) {
        ZookeeperDistrustLock redPakage = new ZookeeperDistrustLock("RedPakage");
        redPakage.lock();

        System.out.println("There do something");

        redPakage.unLock();

    }
}
