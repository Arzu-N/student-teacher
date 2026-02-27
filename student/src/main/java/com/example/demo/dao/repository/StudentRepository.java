package com.example.demo.dao.repository;


import com.example.demo.dao.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Students,Long> {
    List<Students>findByTeacherId(Long id);
}
