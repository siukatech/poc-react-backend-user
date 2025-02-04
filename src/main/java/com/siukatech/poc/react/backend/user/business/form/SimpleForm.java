package com.siukatech.poc.react.backend.user.business.form;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class SimpleForm {
    private String name;
    private Long count;
    private LocalDate date;
    private LocalDateTime datetime;
}
