package com.evakule.service;

import com.evakule.dao.EventDao;
import com.evakule.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventDao eventDao;

    @Override
    public Optional<List<Event>> getAll() {
        return Optional.ofNullable(eventDao.findAll());
    }
}