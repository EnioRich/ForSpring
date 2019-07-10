package com.evakule.service;

import com.evakule.model.UserToEvent;

import java.util.List;
import java.util.Optional;

public interface UserToEventService {

    Optional<List<UserToEvent>> getAll();
}
