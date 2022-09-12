package com.shchepinms.service;

import com.shchepinms.dao.UserDao;
import com.shchepinms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(@Autowired UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void save(User user) {
        if (user.getId() == 0) {
            userDao.save(user);
        } else {
            userDao.merge(user);
        }
    }

    @Transactional
    @Override
    public User getById(long id) {
        return userDao.getById(id);
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public void deleteById(long id) {
        userDao.deleteById(id);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userDao.delete(user);
    }
}
