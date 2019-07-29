package doreflect;

import java.util.Date;

/**
 * @ClassName: UserInfo
 * @description:
 * @author: doujl
 * @create: 2019-07-23 16:11
 **/
public class UserInfo {
    private String name;
    private Integer id;
    private Date birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
