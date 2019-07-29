package ao;

public class Banana extends Fruit {

    String color;
    Integer weight;

    public Banana() {
    }

    public Banana(Integer weight) {
        this.weight = weight;
    }

    public Banana(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
        super.name = "Banana";
    }

    @Override
    public String toString() {
        return "Banana{" +
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
