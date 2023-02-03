package com.example.addressservice;

import com.example.addressservice.dao.AddressDao;
import com.example.addressservice.ds.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class AddressServiceApplication {

    @Autowired
    private AddressDao addressDao;

    @Bean @Profile("dev")
    public ApplicationRunner runner(){
        return r -> {
            Address address1 = new Address("Creek Bridge","22","111111","Yangon");
            Address address2 = new Address("Love Lane","21","111123","Mandalay");
            Address address3 = new Address("Dream Land","20","222222","Yangon");

            addressDao.save(address1);
            addressDao.save(address2);
            addressDao.save(address3);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(AddressServiceApplication.class, args);
    }

}
