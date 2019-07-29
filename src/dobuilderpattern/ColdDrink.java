package dobuilderpattern;

/**
 * @ClassName: ColdDrink
 * @description:
 * @author: doujl
 * @create: 2019-07-10 14:09
 **/

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

