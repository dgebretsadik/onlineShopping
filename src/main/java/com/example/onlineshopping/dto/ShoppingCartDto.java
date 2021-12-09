package com.example.onlineshopping.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ShoppingCartDto implements Serializable {
    private final long id;
    private final List<ItemDto> items;
    private final CustomerDto customer;
}
