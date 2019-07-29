package dobuilderpattern;

/**
 * @ClassName: Wrapper
 * @description: 实现 Packing 接口的实体类。
 * @author: doujl
 * @create: 2019-07-10 14:05
 **/

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}

