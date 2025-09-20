package com.example.Flight.Booking.service;

import com.example.Flight.Booking.Entity.User;
import com.example.Flight.Booking.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class UserService {
    @Autowired
    UserRepo repo;
    public void addUser(User user){
        repo.save(user);
    }
    public Iterable<User> getAllRecords(){
        return repo.findAll();
    }
    public Optional<User> getById(Long id){
        return repo.findById(id);
    }
    public String update(Long id, String email, String password, String purposeOfVisit) {
        Optional<User> op = repo.findById(id);
        if (!op.isPresent()) {
            return "User has not found";
        }
        User user = op.get();
        user.setEmail(email);
        user.setPassword(password);
        user.setPurposeOfVisit(purposeOfVisit);
        repo.save(user);
        return "The Values Has Been Updated...";
    }
}
