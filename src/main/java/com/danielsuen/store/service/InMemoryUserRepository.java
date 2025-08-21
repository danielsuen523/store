package com.danielsuen.store.service;

import com.danielsuen.store.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Scope("singleton")
public class InMemoryUserRepository implements UserRepository{

    private Map<String, User> memory = new HashMap<>();

    @Override
    public void save(User user) {
        memory.put(user.getEmail(), user);
    }
}
