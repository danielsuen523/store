package com.danielsuen.store.service;

import com.danielsuen.store.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NotificationService notificationService;

    public void registerUser(User user) {
        userRepository.save(user);
        notificationService.send("register user : ", user.getEmail());
    }

}
