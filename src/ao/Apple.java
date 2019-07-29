package ao;

public class Apple extends Fruit {

    String color;
    Integer weight;

    public Apple() {
    }

    public Apple(Integer weight) {
        this.weight = weight;
    }

    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
        super.name = "Apple";
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
