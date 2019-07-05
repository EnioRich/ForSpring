package com.evakule.dao;
import com.evakule.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserDao extends JpaRepository<User, Long> {

    @EntityGraph("User.events")
    List<User> findAll();

    Optional<User> getById(Long id);

}