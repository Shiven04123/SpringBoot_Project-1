package com.example.greetingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.greetingapi.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
