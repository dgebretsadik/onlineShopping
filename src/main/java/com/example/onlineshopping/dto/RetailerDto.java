package com.example.onlineshopping.dto;

import com.example.onlineshopping.dto.ProductDto;
import com.example.onlineshopping.dto.UserDto;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RetailerDto implements Serializable {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final int rating;
    private final UserDto user;
    private final List<ProductDto> products;
}
