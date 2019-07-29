package test;

import ao.Apple;
import ao.Fruit;
import com.sun.deploy.util.StringUtils;
import com.sun.org.apache.xpath.internal.SourceTree;
import dotestparam.Grade;
import dotestparam.Student;
import factory.AppleListFactory;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoTest02 {

    @Test
    public void testLambda() {

        List<Fruit> someFruit = AppleListFactory.getSomeFruit(100);

        Map<String, Fruit> fruitMap = someFruit.stream().collect(Collectors.toMap(Fruit::getColor, (key) -> key, (va1, value) -> value));
        List<Fruit> fruitList = fruitMap.values().stream().collect(Collectors.toList());
        List<String> collect = fruitList.stream().map(t -> t.getName()).collect(Collectors.toList());
        System.out.println(collect);
//        List<String> stringList = fruitMap.keySet().stream().collect(Collectors.toList());
//        System.out.println(fruitList);
//        System.out.println(stringList);
    }

    @Test
    public void testRunnable() {
        Runnable r1 = () -> System.out.println("Hello World");
        r1.run();
    }

    @Test
    public void testFunction() {
        Function<Integer, Apple> f = (weight) -> new Apple(weight);
        BiFunction<String, Integer, Apple> c = (w, i) -> new Apple(w, i);
        Apple apply = f.apply(12);
        Apple qw = c.apply("qw", 1);
        System.out.println(apply);

    }

    @Test
    public void testStream() {
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

    }


    @Test
    public void testStream2() {
        String phone = "13363066261";

        String hiddenMiddle = phone.replaceAll("(\\d{3})(\\d{4})(\\d{4})", "$1****$2");

        System.out.println(hiddenMiddle);

    }

    @Test
    public void testStream3() {
//        int index = 2;
//
//        for (int i = 0; i < 20; i++) {
//            String num = String.valueOf(i + (index - 1) * 20);
//            System.out.println(num);
//
//        }

        Integer i = 111;
        i *= 6;
        System.out.println(i);

    }

    @Test
    public void testStream4() {
        Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}).stream().map((n) -> n + 1).forEach(System.out::println);

    }

    @Test
    public void testList4() {

        List<Fruit> someFruit = AppleListFactory.getSomeFruit(5);
        System.out.println("size : " + someFruit.size() + "  ;  someFruit : " + someFruit);
//        Fruit f = new Fruit("red", 10);
//        someFruit.add(1, f);
//        System.out.println("someFruit ： " + someFruit);

    }

    @Test
    public void testLamda4() {
        Map<String, String> map = new HashMap<>();
        List<Apple> appleList = new ArrayList();
        Apple f1 = new Apple("red", 3);
        Apple f2 = new Apple("green", 2);
        Apple f3 = new Apple("yellow", 1);
        appleList.add(f1);
        appleList.add(f2);
        appleList.add(f3);

//        List<Apple> test2 = new ArrayList();
//        test2.add(f1);
//        test2.add(f3);
//        test2.add(f2);
//
//        boolean equalCollection = CollectionUtils.isEqualCollection(appleList, test2);
//        System.out.println("equle"+equalCollection);
//        List<String> collect = appleList.stream().map(t -> t.getColor()).collect(Collectors.toList());
//        System.out.println(collect);

        Map<String, Apple> collect = appleList.stream().collect(Collectors.toMap(Apple::getColor, Function.identity(), (v1, v2) -> v1));

        appleList.sort(Comparator.comparing(Apple::getWeight).reversed());

        System.out.println(appleList);

    }

    @Test
    public void testLamda5() {
//        List<Grade> gradeList = new ArrayList<>();
//        //Grade1
//        Grade grade1 = new Grade();
//        grade1.setId("g1");
//        List<Student> s1List = new ArrayList<>();
//        Student student1 = new Student();
//        student1.setId("s1");
//        student1.setName("lili");
//        student1.setSex("girl");
//        Student student2 = new Student();
//        student2.setId("s2");
//        student2.setName("taotao");
//        student2.setSex("boy");
//        s1List.add(student1);
//        s1List.add(student2);
//        grade1.setList(s1List);
////        student1.setGrade(grade1);
//        //Grade2
//        Grade grade2 = new Grade();
//        grade2.setId("g2");
//        List<Student> s2List = new ArrayList<>();
//        Student student3 = new Student();
//        student3.setId("s3");
//        student3.setName("weiwei");
//        student3.setSex("girl");
//        Student student4 = new Student();
//        student4.setId("s1");
//        student4.setName("pengpeng");
//        student4.setSex("boy");
//        s2List.add(student3);
//        s2List.add(student4);
//        grade2.setList(s2List);
//        gradeList.add(grade1);
//        gradeList.add(grade2);
//
//        Map<String, List<Grade>> collect = gradeList.stream().collect(Collectors.groupingBy(Grade::getId, Collectors.toList()));
//
//        List<List<Student>> collect1 = gradeList.stream().map(t -> t.getList()).collect(Collectors.toList());
//
//        System.out.println(collect1);


    }

    @Test
    public void testLamda6() throws Exception {

//        Long endTime = getEndTime();
//        System.out.println("毫秒数： " + endTime);
//        System.out.println("秒数： " + endTime/1000);
//        System.out.println("分钟数： " + endTime/1000/60);
//        System.out.println("小时数： " + endTime/1000/60/60);

//        Calendar curDate = Calendar.getInstance();
//        Calendar nextDayDate = new GregorianCalendar(curDate.get(Calendar.YEAR), curDate.get(Calendar.MONTH), curDate.get(Calendar.DATE)+1, 0, 0, 0);
//        System.out.println((nextDayDate.getTimeInMillis() - curDate.getTimeInMillis())/1000/60/60);


//        LocalDateTime midnight = LocalDateTime.now().plusDays(1).withHour(0).withMinute(0).withSecond(0).withNano(0);
//        long millSeconds = ChronoUnit.MILLIS.between(LocalDateTime.now(),midnight);
//        long seconds = ChronoUnit.SECONDS.between(LocalDateTime.now(), midnight);
//        long minutes = ChronoUnit.MINUTES.between(LocalDateTime.now(), midnight);


        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date targetDate = dateFormat1.parse("2019-07-26");
        Long distance2TargetTime = getDistance2TargetTime(null, ChronoUnit.DAYS);
        System.out.println("当天剩余天数：" + distance2TargetTime);


    }


    /**
     * 获取到当天结束还有多少毫秒
     *
     * @return
     */
    private static Long getEndTime() {
        Calendar todayEnd = Calendar.getInstance();
        todayEnd.set(Calendar.HOUR_OF_DAY, 23); // Calendar.HOUR 12小时制

        // HOUR_OF_DAY 24小时制
        todayEnd.set(Calendar.MINUTE, 59);
        todayEnd.set(Calendar.SECOND, 59);
        todayEnd.set(Calendar.MILLISECOND, 999);
        return todayEnd.getTimeInMillis();
    }

    /**
     * @param enumUnit 获取类型枚举
     * @return 目标时间到现在的距离对应枚举值
     */
    private static Long getDistance2TargetTime(Date targetDate, ChronoUnit enumUnit) {
        Instant instant = targetDate.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime targetLocaldateTime = instant.atZone(zoneId).toLocalDateTime();
        long distanceTime = enumUnit.between(LocalDateTime.now(), targetLocaldateTime);
        return distanceTime;
    }


    @Test
    public void testLamda7() throws Exception {

        // 相对路径
        Path dir = Paths.get("chenmo.txt");

        // 输出 dir 的绝对路径
        System.out.println(dir.toAbsolutePath()); // 输出：D:\program\java.git\java_demo\chenmo

        if (Files.notExists(dir)) {
            try {
                // 如果目录不存在，则创建目录
                Files.createDirectory(dir);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        // 这时候 chenmo.txt 文件并未创建
        // 通过 resolve 方法把 dir 和 chenmo.txt 链接起来
        Path file = dir.resolve("chenmo.txt");

        // 输出 file 的绝对路径
        System.out.println(file.toAbsolutePath()); // 输出：D:\program\java.git\java_demo\chenmo\chenmo.txt

        if (Files.notExists(file)) {
            try {
                // 如果文件不存在，则创建文件
                Files.createFile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    @Test
//    public void testLamda8() throws Exception {
//        Student student = Student.class.newInstance();
//        student.setId("2");
//        student.setName("LIly");
//        student.setSex("Girl");
//        System.out.println("Student : " + student);
//
//    }

    @Test
    public void testLamda9() throws Exception {
        //1.获取Class对象  
        Class stuClass = Class.forName("dotestparam.Student");
        Method m = stuClass.getMethod("show1", String.class);
        Object obj = stuClass.getConstructor().newInstance();
        Object result = m.invoke(obj, "qwe");//需要两个参数，一个是要调用的对象（获取有反射），一个是实参
        System.out.println("返回值：" + result);
    }


}
