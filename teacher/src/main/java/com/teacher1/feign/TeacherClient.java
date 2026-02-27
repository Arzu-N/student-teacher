package com.teacher1.feign;

import com.teacher1.dto.StudentResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="student",url="http://localhost:8080/api/v1/students")

public interface TeacherClient {
@GetMapping("/{teacherId}")
    List<StudentResponseDto>getStudentsByTeacherId(@PathVariable Long teacherId);
}
