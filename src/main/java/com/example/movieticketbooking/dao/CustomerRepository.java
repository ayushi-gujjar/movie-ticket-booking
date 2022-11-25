package com.example.movieticketbooking.dao;

import com.example.movieticketbooking.entity.Customer;
import com.example.movieticketbooking.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {

}
