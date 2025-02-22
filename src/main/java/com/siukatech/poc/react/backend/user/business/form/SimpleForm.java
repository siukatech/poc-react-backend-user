package com.siukatech.poc.react.backend.user.business.form;

import com.siukatech.poc.react.backend.core.business.form.AbstractForm;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class SimpleForm extends AbstractForm<String> {
    private String name;
    private Long count;
    private LocalDate date;
    private LocalDateTime datetime;
}
