package ao;

public class Fruit {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String color;
    Integer weight;

    public Fruit() {
    }

    public Fruit(Integer weight) {
        this.weight = weight;
    }

    public Fruit(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
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
