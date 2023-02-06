package com.example.customerservice;

import com.example.customerservice.dao.CustomerDao;
import com.example.customerservice.ds.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class CustomerServiceApplication {

    @Autowired
    private CustomerDao customerDao;

    @Bean @Profile("dev")
    public ApplicationRunner runner(){
        return r -> {
            Customer c1 = new Customer("John","Doe","JD","john@gmail.com");
            Customer c2 = new Customer("John","William","JW","william@gmail.com");
            Customer c3 = new Customer("Thomas","Mann","TM","thomas@gmail.com");

            customerDao.save(c1);
            customerDao.save(c2);
            customerDao.save(c3);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

}
