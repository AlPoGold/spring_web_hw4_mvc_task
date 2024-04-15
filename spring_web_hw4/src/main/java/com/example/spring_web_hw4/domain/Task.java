package com.example.spring_web_hw4.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@AllArgsConstructor
@Data
public class Task {

    private String description;
    private Priority priority;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date finishingDate;
}
