package com.example.addressservice.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String streetName;

    private String streetNo;

    private String zipCode;

    private String city;

    public Address() {
    }

    public Address(String streetName, String streetNo, String zipCode, String city) {
        this.streetName = streetName;
        this.streetNo = streetNo;
        this.zipCode = zipCode;
        this.city = city;
    }
}
