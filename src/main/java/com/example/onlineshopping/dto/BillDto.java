package com.example.onlineshopping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillDto implements Serializable {
    private  long id;
    private  LocalDateTime dueDate;
    private  double total;
}
