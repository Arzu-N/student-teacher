package com.teacher1.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TeacherRequestDto {
    private String teacherName;
    private Integer age;
    private BigDecimal salary;

}
