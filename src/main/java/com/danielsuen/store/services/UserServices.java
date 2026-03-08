package com.danielsuen.store.services;

import com.danielsuen.store.entities.User;
import com.danielsuen.store.repositories.AddressRepository;
import com.danielsuen.store.repositories.ProfileRepository;
import com.danielsuen.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServices {

    private final UserRepository userRepository;
    private final ProfileRepository profileRepository;
    private final EntityManager entityManager;
    private final AddressRepository addressRepository;

    public void show() {
        var user = User.builder().name("Daniel").email("testmail").password("password").build();
        userRepository.save(user);

        if (entityManager.contains(user)) {
            System.out.println("User already exists");
        }
        else {
            System.out.println("Transcient");
        }
    }
    public void showRelatedEntities() {
        var profile = profileRepository.findById(2L).orElseThrow();
        System.out.println(profile.getUser().getId());
    }

    public void fetchAddresses() {
        var address = addressRepository.findAll();
    }
}

