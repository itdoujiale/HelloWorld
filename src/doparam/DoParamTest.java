package doparam;

import ao.Apple;
import ao.Fruit;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import doInterface.AppleFilterInterface;
import factory.AppleListFactory;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class DoParamTest {

    public static void main(String[] args) {
////        List<Apple> dataList = AppleListFactory.getAppleList(5);
////        List<Apple> red = AppleFilterInterface.appleFilter(dataList, (Apple app) -> app.getColor().equals("red"));
////        System.out.println("红苹果汇总 ： " + red);
////        System.out.println("===============================================================================");
//
//
//        Stream<Fruit> fruitStream = AppleListFactory.getSomeFruit(100).stream()
//                .filter((f) -> "apple".equals(f.getName()))
//                .collect(Collect);
//        System.out.println(fruitStream);
//        //方法引用
////        red.sort(Comparator.comparing(Apple::getWeight));
        String[] asd = {"7","3","1","2","6","5","1","9","","2"};
        List<String> list = Arrays.asList(asd);
//        list.stream().reduce(a->{a.equals("1")});


    }


}
