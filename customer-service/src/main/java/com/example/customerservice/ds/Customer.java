package com.example.customerservice.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String code;

    private String email;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String code, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = code;
        this.email = email;
    }
}
