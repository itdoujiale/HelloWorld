package donio;

import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @ClassName: NIOTest
 * @description:
 * @author: doujl
 * @create: 2019-07-24 09:11
 **/
public class NIOTest {

    @Test
    public static void testFuture() throws IOException, InterruptedException, ExecutionException {
        Path file = Paths.get("沉默王二.txt");
        AsynchronousFileChannel channel = AsynchronousFileChannel.open(file);
        Future<Integer> result = channel.read(ByteBuffer.allocate(100_000), 0);
        while (!result.isDone()) {
            System.out.println("主线程继续做事情");
        }

        Integer bytesRead = result.get();
        System.out.println(bytesRead);
    }

}
