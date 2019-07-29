package dobuilderpattern;

/**
 * @ClassName: Bottle
 * @description: 实现 Packing 接口的实体类。
 * @author: doujl
 * @create: 2019-07-10 14:07
 **/

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}

