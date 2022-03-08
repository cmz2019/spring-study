package com.strawberry.dao;

public class UserDaoMySQLImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("MySql获取用户配置！");
    }
}
