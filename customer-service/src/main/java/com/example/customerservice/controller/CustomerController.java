package com.example.customerservice.controller;

import com.example.customerservice.dao.CustomerDao;
import com.example.customerservice.ds.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @GetMapping("/all")
    public Customers listAllCustomer(){
        return new Customers(customerDao.findAll().spliterator());
    }
}
