package com.example.onlineshopping.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ItemDto implements Serializable {
    private final long id;
    private final double price;
    private final ShoppingCartDto cart;
    private final OrderDto order;
}
