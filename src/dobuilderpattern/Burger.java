package dobuilderpattern;

/**
 * @ClassName: Burger
 * @description: Burger
 * @author: doujl
 * @create: 2019-07-10 14:09
 **/

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

