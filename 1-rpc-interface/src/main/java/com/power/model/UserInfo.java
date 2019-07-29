package com.power.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: UserInfo
 * @description:
 * @author: doujl
 * @create: 2019-07-22 15:16
 **/
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 6390975669484469184L;
    private Integer id;
    private String phone;
    private Date birthDay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
