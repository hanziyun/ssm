package com.javakc.ssm.user.dao.impl;

import com.javakc.ssm.user.dao.UserDao;
import com.javakc.ssm.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public int insert(User entity) {
        return 0;
    }

    @Override
    public int update(User entity) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public User queryById(int id) {
        return null;
    }

    @Override
    public long queryByCount() {
        return 0;
    }
}
