package com.example.onlineshopping.dto;

import com.example.onlineshopping.domain.OrderStatus;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDto implements Serializable {
    private final long id;
    private final LocalDateTime orderDateTime;
    private final List<ItemDto> items;
    private final CustomerDto customer;
    private final OrderStatus orderStatus;
    private final BillDto bill;
}
