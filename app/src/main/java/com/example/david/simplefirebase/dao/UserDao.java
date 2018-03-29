package com.example.david.simplefirebase.dao;

import com.example.david.simplefirebase.model.User;

import java.util.List;

public interface UserDao {
    public List<User> select();
    public void insert(User user);
    public void update(User user);
    public void delete(User user);
}
