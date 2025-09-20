package com.example.Flight.Booking.repository;

import com.example.Flight.Booking.Entity.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FlightRepo extends CrudRepository<Flight, Long> {
    public List<Flight> findBySourceAndDestinationAndDate(String source, String destination, LocalDateTime date);
}
