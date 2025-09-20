package com.example.Flight.Booking.controller;
import com.example.Flight.Booking.Entity.Booking;
import com.example.Flight.Booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {
    @Autowired
    BookingService service;
    @PutMapping(value="/booking/{id}")
    public String addBooking(@PathVariable("id") Long idNo, @RequestParam Long id, @RequestParam Long flightId, @RequestParam Integer seatsBooked){
        service.addBooking(idNo, id, flightId, seatsBooked);
        return "The Flight has been booked For the "+idNo;
    }
    @GetMapping(value="/bookings/all")
    public Iterable<Booking> getAll(){
        return service.getAll();
    }
    @GetMapping(value="/bookings/{id}")
    public Booking getBookingById(@PathVariable("id") Long idNo) {
        return service.getBookingById(idNo);
    }
    @PutMapping(value="/bookings/update/{id}")
    public String update(@PathVariable("id") Long idNo, @RequestParam("seats") Integer seatsBooked, @RequestParam("status") String status) {
        service.update(idNo, seatsBooked, status);
        return "The "+idNo+"'s data has been Updated...";
    }
    @DeleteMapping(value="/bookings/{id}")
    public String cancel(@PathVariable("id") Long idNo) {
        service.cancel(idNo);
        return "Booking-Cancelled";
    }
    @DeleteMapping(value="/bookings/deleteAll")
    public String deleteAll(){
        service.cancelAll();
        return"All the bookings have been cancelled...";
    }
    @GetMapping(value="/bookings/history/{userId}")
    public List<Booking> bookingHistory(@PathVariable("userId") Long idNo) {
        return service.bookingHistory(idNo);
    }
}
