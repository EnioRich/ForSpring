package com.evakule.service;

import com.evakule.model.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {

    Optional<List<Event>> getAll();
}
