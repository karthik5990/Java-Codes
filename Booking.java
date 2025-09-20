package com.example.Flight.Booking.Entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Booking {
    @Id
    @Column
    Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="flight_id")
    private Flight flight;
    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy'T'HH:mm")
    LocalDateTime bookingTime;
    @Column
    String status;
    @Column
    Integer seatsBooked;
    @Column
    Double totalPrice;
    public Booking() {
    }
    public Booking(Long id, User user, Flight flight, LocalDateTime bookingTime, String status, Integer seatsBooked, Double totalPrice) {
        this.id = id;
        this.user = user;
        this.flight = flight;
        this.bookingTime = bookingTime;
        this.status = status;
        this.seatsBooked = seatsBooked;
        this.totalPrice = totalPrice;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public LocalDateTime getBookingTime() {
        return bookingTime;
    }
    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getSeatsBooked() {
        return seatsBooked;
    }
    public void setSeatsBooked(Integer seatsBooked) {
        this.seatsBooked = seatsBooked;
    }
    public Double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
