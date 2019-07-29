package dobuilderpattern;

/**
 * @ClassName: ChickenBurger
 * @description:
 * @author: doujl
 * @create: 2019-07-10 14:11
 **/

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
