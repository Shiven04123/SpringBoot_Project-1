
package com.example.greetingapi;
import com.example.greetingapi.StudentService.*;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.greetingapi.service.StudentService;

@RestController
public class GreetingController {

    private final StudentService service;

    public GreetingController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        return service.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {

        return service.deleteStudent(id);
        
    }
}
