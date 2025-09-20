package com.example.Flight.Booking.service;
import com.example.Flight.Booking.Entity.Booking;
import com.example.Flight.Booking.Entity.Flight;
import com.example.Flight.Booking.Entity.User;
import com.example.Flight.Booking.repository.BookingRepo;
import com.example.Flight.Booking.repository.FlightRepo;
import com.example.Flight.Booking.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class BookingService {
    @Autowired
    FlightRepo flightRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    BookingRepo bookRepo;
    public Booking addBooking(Long id, Long userId, Long flightId, Integer seatsBooked) {
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User is not found in the Data..."));
        Flight flight = flightRepo.findById(flightId)
                .orElseThrow(() -> new RuntimeException("Flight is not found in the Data..."));
        Booking booking = new Booking();
        if (flight.getAvailableSeats() < seatsBooked) {
            throw new RuntimeException("Not enough seats available");
        }
        flight.setAvailableSeats(flight.getAvailableSeats() - seatsBooked);
        flightRepo.save(flight);
        booking.setId(id);
        booking.setUser(user);
        booking.setFlight(flight);
        booking.setBookingTime(LocalDateTime.now());
        booking.setStatus("Booking-Confirmed");
        booking.setSeatsBooked(seatsBooked);
        Double p = flight.getPrice()*seatsBooked;
        booking.setTotalPrice(p);
        return bookRepo.save(booking);
    }
    public Iterable<Booking> getAll(){
        return bookRepo.findAll();
    }
    public Booking getBookingById(Long id) {
        return bookRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking has not found in the Data..."));
    }
    public Booking update(Long bookingId, Integer seatsBooked, String status) {
        Booking booking = getBookingById(bookingId);
        if (seatsBooked != null)
            booking.setSeatsBooked(seatsBooked);
        if (status != null)
            booking.setStatus(status);
        return bookRepo.save(booking);
    }
    public void cancel(Long bookingId) {
        Booking booking = getBookingById(bookingId);
        booking.setStatus("Booking Has Been Cancelled...");
        bookRepo.save(booking);
    }
    public void cancelAll(){
        bookRepo.deleteAll();
    }
    public List<Booking> bookingHistory(Long userId) {
        return bookRepo.findAllByUserId(userId);
    }
}

