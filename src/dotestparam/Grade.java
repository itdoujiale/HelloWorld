package dotestparam;

import java.util.List;

/**
 * @ClassName: Grade
 * @description:
 * @author: doujl
 * @create: 2019-07-11 14:29
 **/
public class Grade {
    private String id;
    private List<Student> list;

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Grade(String id) {
        this.id = id;
    }

    public Grade() {
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id='" + id + '\'' +
                ", list=" + list +
                '}';
    }
}
