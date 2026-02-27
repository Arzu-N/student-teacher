package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentResponseDto {
    private String userName;
    private Integer age;
    private Long teacherId;
   // private BigDecimal salary;
    private LocalDate createdDate;
    private String createdBy;
    private LocalDate lastModifiedDate;
    private String lastModifiedBy;
}
