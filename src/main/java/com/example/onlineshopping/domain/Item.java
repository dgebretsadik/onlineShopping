package com.example.onlineshopping.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double price;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private ShoppingCart cart;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Order order;

    @ManyToOne
    private Product product;
}
