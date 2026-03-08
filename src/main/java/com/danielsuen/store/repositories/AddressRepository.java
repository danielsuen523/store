package com.danielsuen.store.repositories;

import com.danielsuen.store.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
