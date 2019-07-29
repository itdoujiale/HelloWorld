package dostream;

import ao.Apple;
import ao.Fruit;
import factory.AppleListFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DoStreamTest {

    public static void main(String[] args) {

//        List<Fruit> someFruit = AppleListFactory.getSomeFruit(5);
//        List<Apple> red = dataList.parallelStream().filter((Apple app) -> app.getColor().equals("red")).collect(toList());
//        List<Apple> green = dataList.parallelStream().filter((Apple app) -> app.getColor().equals("green")).collect(toList());
//        System.out.println("苹果汇总 ： " + dataList);
//        System.out.println("红苹果汇总 ： " + red);
//        System.out.println("绿苹果汇总 ： " + green);

        List<Fruit> someFruit = AppleListFactory.getSomeFruit(10);
    }
}
