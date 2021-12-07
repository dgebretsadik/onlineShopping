package com.example.onlineshopping.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customerOrder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDateTime orderDateTime;

    @OneToMany(mappedBy = "order", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Item> items;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Customer customer;

    @Enumerated
    private OrderStatus orderStatus;
    @OneToOne(mappedBy = "order", fetch = FetchType.EAGER)
    private Bill bill;
}
