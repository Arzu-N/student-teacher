package com.teacher1.rest;

import com.teacher1.dto.TeacherRequestDto;
import com.teacher1.dto.TeacherResponseDto;
import com.teacher1.dto.TeacherStudentDto;
import com.teacher1.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    @PostMapping
    public TeacherResponseDto addTeacher(@RequestBody TeacherRequestDto dto){
   return teacherService.addTeacher(dto);
    }
    @GetMapping("/{id}")
    public TeacherStudentDto getTeacherWithStudentsById(@PathVariable Long id){
        return teacherService.getTeacherWithStudents(id);
    }
}
