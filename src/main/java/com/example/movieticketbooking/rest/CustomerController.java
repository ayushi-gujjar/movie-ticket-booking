package com.example.movieticketbooking.rest;

import com.example.movieticketbooking.entity.Customer;
import com.example.movieticketbooking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService theCustomerService) {
        customerService = theCustomerService;
    }

    @GetMapping("/customers")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @PostMapping("/customers")
    public Customer add(@RequestBody Customer customer) {
        customer.setId(0);
        System.out.println(customer);
        customerService.save(customer);
        return customer;
    }

    @DeleteMapping("customers/{id}")
    public String deleteById(@PathVariable int id) {
        Optional<Customer> customer = customerService.getById(id);
        customerService.deleteById(id);
        return "theater deleted successfully with id " + id;
    }

    @GetMapping("customers/{id}")
    public Optional<Customer> getById(@PathVariable int id){
        Optional<Customer> customer = customerService.getById(id);
        return customer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer customer) {
        customerService.save(customer);
        return customer;
    }
}
