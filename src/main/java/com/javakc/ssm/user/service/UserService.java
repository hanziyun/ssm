package com.javakc.ssm.user.service;

import com.javakc.ssm.user.entity.User;

import java.util.List;


public interface UserService {
    public int insert(User entity);
    public int update(User entity);
    public int delete(int id);
    public List<User> queryAll();
    public User queryById(int id);
    public long queryByCount();
}
