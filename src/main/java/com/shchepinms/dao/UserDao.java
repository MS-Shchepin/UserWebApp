package com.shchepinms.dao;

import com.shchepinms.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    User getById(long id);
    List<User> getAllUsers();
    void deleteById(long id);
    void delete(User user);

    void merge(User user);
}
