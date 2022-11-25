package com.example.movieticketbooking.dao;

import com.example.movieticketbooking.entity.Booking;
import com.example.movieticketbooking.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
}
