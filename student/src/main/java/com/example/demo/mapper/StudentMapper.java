package com.example.demo.mapper;

import com.example.demo.dao.entity.Students;
import com.example.demo.dto.StudentRequestDto;
import com.example.demo.dto.StudentResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface StudentMapper {
Students toEntity(StudentRequestDto dto);
StudentResponseDto toDto(Students dto);
List<StudentResponseDto>toDtoList(List<Students>students);
}
