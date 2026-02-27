package com.teacher1.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Entity
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
public class Teacher extends BaseEntity{
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String teacherName;
    private Integer age;
    private BigDecimal salary;
}
