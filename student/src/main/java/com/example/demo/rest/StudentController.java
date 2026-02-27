package com.example.demo.rest;

import com.example.demo.dto.StudentRequestDto;
import com.example.demo.dto.StudentResponseDto;
import com.example.demo.service.StudentService;
import jakarta.servlet.ServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<StudentResponseDto>getStudents(ServletRequest servletRequest){
        return studentService.getStudents();
    }

    @GetMapping("/{teacherId}")
    public List<StudentResponseDto>getStudentsByTeacherId(@PathVariable Long teacherId, ServletRequest servletRequest){
        return studentService.getStudentsByTeacherId(teacherId);
    }
    @PostMapping
    public StudentResponseDto addStudent(@RequestBody StudentRequestDto request){
       return  studentService.addStudent(request);
    }
}
