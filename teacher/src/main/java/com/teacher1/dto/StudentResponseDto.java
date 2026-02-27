package com.teacher1.dto;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
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
