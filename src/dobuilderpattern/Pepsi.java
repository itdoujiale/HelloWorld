package dobuilderpattern;

/**
 * @ClassName: Pepsi
 * @description:
 * @author: doujl
 * @create: 2019-07-10 14:12
 **/

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}

