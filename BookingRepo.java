package com.example.Flight.Booking.repository;

import com.example.Flight.Booking.Entity.Booking;
import com.example.Flight.Booking.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepo extends CrudRepository<Booking, Long> {
    public List<Booking> findByUser(User user);
    public List<Booking> findAllByUserId(Long Id);

}
