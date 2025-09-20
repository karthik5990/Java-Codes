package com.example.Flight.Booking.repository;

import com.example.Flight.Booking.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    public User findByEmail(String email);
    public Optional<User> findByName(String name);
}
