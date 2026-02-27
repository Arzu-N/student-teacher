package com.example.demo.service;

import com.example.demo.dao.repository.StudentRepository;
import com.example.demo.dto.StudentRequestDto;
import com.example.demo.dto.StudentResponseDto;
import com.example.demo.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentResponseDto addStudent(StudentRequestDto request){
        return studentMapper.toDto(studentRepository.save(studentMapper.toEntity(request)));
    }
    public List<StudentResponseDto>getStudents(){
        return studentMapper.toDtoList(studentRepository.findAll());
    }
    public List<StudentResponseDto>getStudentsByTeacherId(Long id){
        return studentMapper.toDtoList(studentRepository.findByTeacherId(id));
    }
}
