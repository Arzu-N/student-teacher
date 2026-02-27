package com.teacher1.service;

import com.teacher1.dao.entity.Teacher;
import com.teacher1.dao.repository.TeacherRepository;
import com.teacher1.dto.StudentResponseDto;
import com.teacher1.dto.TeacherRequestDto;
import com.teacher1.dto.TeacherResponseDto;
import com.teacher1.dto.TeacherStudentDto;
import com.teacher1.feign.TeacherClient;
import com.teacher1.mapper.TeacherMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service@RequiredArgsConstructor
public class TeacherService {

    private final TeacherMapper teacherMapper;
    private final TeacherRepository teacherRepository;
private final TeacherClient client;
    public List<TeacherResponseDto> getTeachers(){
return teacherMapper.toDtoList(teacherRepository.findAll());
    }
    public TeacherResponseDto addTeacher(TeacherRequestDto dto){
       return teacherMapper.toDto(teacherRepository.save(teacherMapper.toEntity(dto)));
    }
    public TeacherStudentDto getTeacherWithStudents(Long teacherId){
        Teacher teacher = teacherRepository.findById(teacherId).orElseThrow(() ->
                new RuntimeException("Teacher tapilmadi"));
        List<StudentResponseDto> studentsByTeacherId = client.getStudentsByTeacherId(teacherId);
        return TeacherStudentDto.builder().id(teacher.getId()).teacherName(teacher.getTeacherName()).
                age(teacher.getAge()).salary(teacher.getSalary()).createdDate(teacher.getCreatedDate()).
                createdBy(teacher.getCreatedBy()).lastModifiedDate(teacher.getLastModifiedDate()).
                lastModifiedBy(teacher.getLastModifiedBy()).students(studentsByTeacherId).build();


    }
}
