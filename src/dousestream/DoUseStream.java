package dousestream;

import ao.Apple;
import ao.Fruit;
import ao.Trader;
import ao.Transaction;
import factory.AppleListFactory;
import net.sf.json.JSONObject;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DoUseStream {

    public static void main(String[] args) {


//        List<Fruit> someFruit = AppleListFactory.getSomeFruit(100);
//        someFruit.stream().collect()
//        someFruit.stream().collect(Collectors.toMap(Fruit::getName,(p)->p,(v1,v2)->v1));
////        Map<String, List<Fruit>> collect1 = someFruit.stream().collect(Collectors.groupingBy(Fruit::getName));
//        Map<String, List<Fruit>> collect = someFruit.stream().filter((Fruit f) -> f.getWeight() < 50)
//                .collect(Collectors.groupingBy(Fruit::getName));
//        System.out.println(collect);

//        Map<String, Fruit> collect = someFruit.stream().collect(Collectors.toMap(Fruit::getName, (p) -> p, (v1, v2) -> v1));
//        System.out.println(collect);
//
//        Boolean b = true;
//        Boolean a = false;
//        System.out.println(a.);

//        com.alibaba.fastjson.JSONObject jb = new com.alibaba.fastjson.JSONObject();
//        jb.put("text",1);
//        jb.put("text",123);
//        System.out.println(jb);

//        Integer er = 2;
//        String yi = "2";
//        if (yi.equals(er.toString())){
//            System.out.println("======");
//        }
        List<Fruit> someFruit = AppleListFactory.getSomeFruit(100);
        List<String> collect = someFruit.stream().map(t -> t.getName()).collect(Collectors.toList());
//        Map<String, Fruit> collect = someFruit.stream().collect(Collectors.toMap(Fruit::getName, (key) -> key, (value1, value2) -> value1));
//
//
        System.out.println(collect);


    }
}
