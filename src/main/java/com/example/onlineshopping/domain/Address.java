package com.example.onlineshopping.domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String street;
    private int zip;
    private String country;
    private String city;
    private boolean isPrimary;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer addressCustomer;
}
