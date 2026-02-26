package com.danielsuen.store;

import com.danielsuen.store.entities.Address;
import com.danielsuen.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var user = new User();
        user.setName("Daniel");
        user.setPassword("1234");
        user.setEmail("test@gmail.com");
        user.setPassword("1234");

        // enabled by lombok @Builder
        User.builder()
                .name("Daniel")
                .password("1234")
                .email("email")
                .build();

        var address = Address.builder()
                .street("123 Main St")
                .city("Main St")
                .state("Main St")
                .zip("12345")
                .build();

        user.addAddress(address);
    }
}
