package com.teacher1.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TeacherStudentDto {
    private Long id;
    private String teacherName;
    private Integer age;
    private BigDecimal salary;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedBy;
    List<StudentResponseDto>students;

}
