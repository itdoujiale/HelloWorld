package doInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleFilterInterface {

    public static  <T> List<T> appleFilter(List<T> data, Predicate<T> p) {
        List<T> list = new ArrayList<T>();
        for (T t : data) {
            if (p.test(t)) {
                list.add(t);
            }
        }
        return list;
    }
}
