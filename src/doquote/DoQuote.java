package doquote;

import ao.Apple;
import ao.Fruit;
import factory.AppleListFactory;

import java.lang.reflect.Array;
import java.nio.file.DirectoryStream;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoQuote {

    static Map<String, BiFunction<String, Integer, Apple>> map = new HashMap();

    static {
        map.put("red", Apple::new);
        map.put("green", Apple::new);
    }

    public static Apple getApple(String color, Integer weight) {
        return map.get(color).apply(color,weight);
    }

    public static void main(String[] args) {

        String asd = null ;
        System.out.println(asd.toString());
        System.out.println(asd.toString());

    }
}
