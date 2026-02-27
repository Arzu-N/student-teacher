package com.teacher1.mapper;


import com.teacher1.dao.entity.Teacher;
import com.teacher1.dto.TeacherRequestDto;
import com.teacher1.dto.TeacherResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")

public interface TeacherMapper {
    Teacher toEntity(TeacherRequestDto dto);
    TeacherResponseDto toDto(Teacher teacher);
    List<TeacherResponseDto>toDtoList(List<Teacher>list);
}
