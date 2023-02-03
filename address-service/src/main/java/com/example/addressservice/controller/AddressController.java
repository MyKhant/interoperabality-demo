package com.example.addressservice.controller;

import com.example.addressservice.dao.AddressDao;
import com.example.addressservice.ds.Addresses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressDao addressDao;

    @GetMapping("/all")
    public Addresses findAllList(){
        return new Addresses(addressDao.findAll().spliterator());
    }
}
