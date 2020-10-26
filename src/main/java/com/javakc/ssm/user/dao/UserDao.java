package com.javakc.ssm.user.dao;

import com.javakc.ssm.user.entity.User;

import java.util.List;

public interface UserDao {
    public int insert(User entity);
    public int update(User entity);
    public int delete(int id);
    public List<User> queryAll();
    public User queryById(int id);
    public long queryByCount();
}
