package doannotation;

/**
 * @ClassName: User
 * @description: 注解测试类
 * @author: doujl
 * @create: 2018-12-18 10:37
 **/
public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    @Init(value = "liang")
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    @Init(value = "23")
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
