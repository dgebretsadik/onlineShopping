package com.example.onlineshopping.dto;

import com.example.onlineshopping.domain.CustomerStatus;
import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerDto implements Serializable {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final CustomerStatus status;
}
