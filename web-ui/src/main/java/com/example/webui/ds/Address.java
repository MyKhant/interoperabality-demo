package com.example.webui.ds;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
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
