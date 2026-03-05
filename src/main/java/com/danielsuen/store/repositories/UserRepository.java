package com.danielsuen.store.repositories;

import com.danielsuen.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
