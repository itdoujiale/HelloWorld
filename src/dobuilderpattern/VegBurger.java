package dobuilderpattern;

/**
 * @ClassName: VegBurger
 * @description:
 * @author: doujl
 * @create: 2019-07-10 14:11
 **/

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
