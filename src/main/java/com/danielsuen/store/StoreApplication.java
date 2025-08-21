package com.danielsuen.store;

import com.danielsuen.store.service.OrderService;
import com.danielsuen.store.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();

//        var notificationService = context.getBean(NotificationService.class);
//        notificationService.send("test");

        var userService = context.getBean(UserService.class);
        User user1 = new User(1, "1@gmail.com", "abc123", "User 1");
        User user2 = new User(2, "2@gmail.com", "abc123", "User 2");
        User user3 = new User(3, "3@gmail.com", "abc123", "User 3");
        userService.registerUser(user1);
        userService.registerUser(user2);
        userService.registerUser(user3);
	}

}
