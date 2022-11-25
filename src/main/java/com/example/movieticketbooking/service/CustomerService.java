package com.example.movieticketbooking.service;

import com.example.movieticketbooking.dao.BookingRepository;
import com.example.movieticketbooking.dao.CustomerRepository;
import com.example.movieticketbooking.entity.Booking;
import com.example.movieticketbooking.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository theCustomerRepo) {
        customerRepository = theCustomerRepo;
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getById(int id){
        return customerRepository.findById(id);
    }

    public void  deleteById(int id) {
        customerRepository.deleteById(id);
    }
}
