package com.example.onlineshopping.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BillDto implements Serializable {
    private final long id;
    private final LocalDateTime dueDate;
    private final double total;
}
