package com.strawberry.dao;

import com.strawberry.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    User getUserById2(Map<String, Object> map);

    List<User> getUserLike(String name);

    int addUser(User user);

    int updateUser(User user);

    int addUser2(Map<String, Object> map);
}
