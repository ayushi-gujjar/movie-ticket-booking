package com.example.movieticketbooking.service;

import com.example.movieticketbooking.dao.BookingRepository;
import com.example.movieticketbooking.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository theBookingRepo) {
        bookingRepository = theBookingRepo;
    }

    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> getById(int id){
        return bookingRepository.findById(id);
    }

    public void  deleteById(int id) {
        bookingRepository.deleteById(id);
    }
}
