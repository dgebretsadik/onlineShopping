package com.example.onlineshopping.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private final long id;
    private final String username;
    private final String password;
    private final String phone;
    private final String email;
    private final RoleDto role;
    private final CustomerDto customer;
}
