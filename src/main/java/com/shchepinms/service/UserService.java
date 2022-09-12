package com.shchepinms.service;

import com.shchepinms.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User getById(long id);
    List<User> getAllUsers();
    void deleteById(long id);
    void delete(User user);
}
