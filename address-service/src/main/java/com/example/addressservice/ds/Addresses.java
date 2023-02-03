package com.example.addressservice.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Data
@AllArgsConstructor
public class Addresses {

    private List<Address> addresses;

    public Addresses() {
    }

    public Addresses(Spliterator<Address> spliterator) {
        addresses = StreamSupport.stream(spliterator, false)
                .collect(Collectors.toList());
    }
}
