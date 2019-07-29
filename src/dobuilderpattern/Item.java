package dobuilderpattern;

/**
 * @ClassName: Item
 * @description: 一个表示食物条目和食物包装的接口
 * @author: doujl
 * @create: 2019-07-10 14:03
 **/

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
