package com.example.onlineshopping.dto;

import com.example.onlineshopping.domain.Customer;
import com.example.onlineshopping.domain.Item;
import com.example.onlineshopping.domain.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto implements Serializable {
    private  long id;
    private  LocalDateTime orderDateTime;
    private  List<Item> items;
    private Customer customer;
    private  OrderStatus orderStatus;
    private  BillDto bill;
}
