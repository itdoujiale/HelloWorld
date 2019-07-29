package factory;

import ao.Apple;
import ao.Banana;
import ao.Fruit;
import ao.Orange;

import java.util.*;
import java.util.function.BiFunction;

public class AppleListFactory {

    static Map<String, BiFunction<String, Integer, Fruit>> map = new HashMap<>();
    static List<Fruit> fruitsList = new ArrayList();

    static {
        map.put("apple", Apple::new);
        map.put("orange", Orange::new);
        map.put("banana", Banana::new);
    }

    public static List<Fruit> getSomeFruit(int count) {
        int weight;
        int colorRandom;
        int fruitRandom;
        String[] colorStr = {"red", "green", "yellow"};
        String[] fruitStr = {"apple", "orange", "banana"};
        for (int i = 0; i < count; i++) {
            weight = (int) (Math.random() * 100);
            colorRandom = (int) (Math.random() * 3);
            fruitRandom = (int) (Math.random() * 3);
            Fruit meFruit = getMeFruit(fruitStr[fruitRandom], colorStr[colorRandom], weight);
            fruitsList.add(meFruit);
        }
        return fruitsList;
    }

    public static Fruit getMeFruit(String fruit, String color, Integer weight) {
        return map.get(fruit.toLowerCase())
                .apply(color, weight);
    }


}
