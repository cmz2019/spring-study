package com.strawberry.dao;

import com.strawberry.pojo.User;
import com.strawberry.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void test() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        session.close();
    }

    @Test
    public void getUserByIdTest() {
        SqlSession session = MybatisUtils.getSqlSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        session.close();
    }

    @Test
    public void getUserById2Test() {
        SqlSession session = MybatisUtils.getSqlSession();

        UserMapper mapper = session.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("helloId", 1);
        map.put("name", "草莓汁");
        User userById2 = mapper.getUserById2(map);
        System.out.println(userById2);

        session.close();
    }

    @Test
    public void addUserTest() {
        SqlSession session = MybatisUtils.getSqlSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(6, "王六", "123334"));
        if (res > 0) {
            // 修改数据库记得提交事务
            session.commit();
        }

        session.close();
    }

    @Test
    public void getUserLikeTest() {
        SqlSession session = MybatisUtils.getSqlSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userLike = mapper.getUserLike("%王%");
        for (User user : userLike) {
            System.out.println(user);
        }

        session.close();
    }
}
