package ao;

public class Orange extends Fruit {

    String color;
    Integer weight;

    public Orange() {
    }

    public Orange(Integer weight) {
        this.weight = weight;
    }

    public Orange(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
        super.name = "Orange";
    }

    @Override
    public String toString() {
        return "Orange{" +
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
