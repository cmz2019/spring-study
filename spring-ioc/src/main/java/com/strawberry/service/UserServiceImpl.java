package com.strawberry.service;

import com.strawberry.dao.UserDao;
import com.strawberry.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    // 此处写死了实现类，若要修改需要改动源代码
    private UserDao userDao;

    // 利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
