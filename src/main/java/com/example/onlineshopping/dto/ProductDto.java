package com.example.onlineshopping.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductDto implements Serializable {
    private final long id;
    private final String description;
    private final String make;
    private final int year;
    private final RetailerDto retailerDto;
}
