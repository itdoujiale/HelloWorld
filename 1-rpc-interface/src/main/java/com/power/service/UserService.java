package com.power.service;

import com.power.model.UserInfo;

public interface UserService {

    public String sayHi(String name);

    public UserInfo getUserInfo(Integer id);
}
