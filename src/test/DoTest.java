package test;

import ao.Apple;
import ao.Fruit;
import factory.AppleListFactory;

import java.util.*;
import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoTest {

    static Map<String, BiFunction<String, Integer, Apple>> map = new HashMap();

    static {
        map.put("red", Apple::new);
        map.put("green", Apple::new);
    }

    public static Apple getApple(String color, Integer weight) {
        return map.get(color).apply(color, weight);
    }

    public static void main(String[] args) {
        String s = formatDuring(86400000L*2-1+1+86400000);
        System.out.println(s);


    }

    /**
     * 检查输入的数据中是否有除了汉字字母和数字以外的字符
     *
     * @param qString 要检查的数据
     * @return boolean 如果包含正则表达式 <code> regx </code> 中定义的特殊字符，返回true；
     * 否则返回false
     */
    public static boolean hasCrossScriptRisk(String qString) {
        if (qString != null) {
            qString = qString.trim();
            String regex = "^[a-zA-Z\u4E00-\u9FA5]+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher match = pattern.matcher(qString);
            boolean b = match.matches();
            if (b) {
                System.out.println(">>> 1");
                return false;
            } else {
                System.out.println(">>> 2");
                return true;
            }
        }
        return false;
    }

    public static String formatDuring(long mss) {
        long days = mss / (1000 * 60 * 60 * 24);
        return String.valueOf(days);
    }
}
