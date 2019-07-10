package com.evakule.dao;

import com.evakule.model.UserToEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserToEventDao extends JpaRepository<UserToEvent, Long> {
}
