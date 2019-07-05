package com.evakule.service;

import com.evakule.dao.UserDao;
import com.evakule.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public Optional<List<User>> getAll() {
        return Optional.ofNullable(userDao.findAll());
    }

    @Override
    public Optional<User> create(User user) {
        return Optional.of(userDao.save(user));
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public Optional<User> edit(User user) {
        return Optional.of(userDao.save(user));
    }

    @Override
    public Optional<User> getById(Long id) {
        return userDao.getById(id);
    }
}