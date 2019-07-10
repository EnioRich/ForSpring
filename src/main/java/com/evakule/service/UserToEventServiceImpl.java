package com.evakule.service;

import com.evakule.dao.UserToEventDao;
import com.evakule.model.UserToEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserToEventServiceImpl implements UserToEventService {

    @Autowired
    private UserToEventDao userToEventDao;

    @Override
    public Optional<List<UserToEvent>> getAll() {
        return Optional.ofNullable(userToEventDao.findAll());
    }
}