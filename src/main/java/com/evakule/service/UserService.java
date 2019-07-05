package com.evakule.service;

import com.evakule.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<List<User>> getAll();

    Optional<User> create(User user);

    void delete (Long id);

    Optional <User> edit(User user);

    Optional<User> getById(Long id);

}