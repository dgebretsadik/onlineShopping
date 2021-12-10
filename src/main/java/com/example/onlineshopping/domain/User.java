package com.example.onlineshopping.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    @JsonIgnore
    private String password;
    @NotNull(message = "Phone number is compulsory")
    @Pattern(regexp="(^[0-9]{10})$")
    private String phone;
    @Email
    @NotNull(message = "Email address is compulsory")
    private String email;
    @OneToOne
    private Role role;
    @OneToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private Customer customer;

    @OneToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private Retailer retailer;
}
