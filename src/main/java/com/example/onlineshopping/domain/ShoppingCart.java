package com.example.onlineshopping.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "cart",cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Item> items;

    @OneToOne(mappedBy = "cart", fetch = FetchType.LAZY)
    private Customer customer;

}
