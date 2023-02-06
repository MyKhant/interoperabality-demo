package com.example.webui.ds;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

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
