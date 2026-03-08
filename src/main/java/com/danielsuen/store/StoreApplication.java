package com.danielsuen.store;

import com.danielsuen.store.entities.User;
import com.danielsuen.store.repositories.UserRepository;
import com.danielsuen.store.services.UserServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
    }
}
