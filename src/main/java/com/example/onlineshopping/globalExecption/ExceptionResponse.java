package com.example.onlineshopping.globalExecption;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ExceptionResponse {
    private LocalDateTime time;
    private String message;
    private String details;
}
