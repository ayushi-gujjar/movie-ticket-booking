package com.example.movieticketbooking.rest;

import com.example.movieticketbooking.entity.Booking;
import com.example.movieticketbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class BookingController {
    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService theBookingService) {
        bookingService = theBookingService;
    }

    @GetMapping("/bookings")
    public List<Booking> findAll() {
        return bookingService.findAll();
    }

    @PostMapping("/bookings")
    public Booking add(@RequestBody Booking booking) {
        booking.setId(0);
        bookingService.save(booking);
        return booking;
    }

    @DeleteMapping("bookings/{id}")
    public String deleteById(@PathVariable int id) {
        Optional<Booking> customer =bookingService.getById(id);
        bookingService.deleteById(id);
        return "booking deleted successfully with id " + id;
    }

    @GetMapping("bookings/{id}")
    public Optional<Booking> getById(@PathVariable int id){
        Optional<Booking> booking = bookingService.getById(id);
        return booking;
    }

    @PutMapping("/bookings")
    public Booking updateCustomer(@RequestBody Booking booking) {
        bookingService.save(booking);
        return booking;
    }
}
