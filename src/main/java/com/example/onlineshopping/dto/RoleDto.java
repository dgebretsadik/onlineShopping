package com.example.onlineshopping.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleDto implements Serializable {
    private final long id;
    private final String Role;
}
