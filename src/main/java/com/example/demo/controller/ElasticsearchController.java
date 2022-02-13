package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ElasticsearchController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customer")
    public String saveCustomer(@RequestBody List<Customer> customers){
        customerRepository.saveAll(customers);
        return "Customer Added Successfully";
    }

    @GetMapping("/customer")
    public Iterable<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("/customer/{name}")
    public List<Customer> findCustomer(@PathVariable String name){
        return customerRepository.findByName(name);
    }
}
