package com.example.greetingapi.StudentService;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.greetingapi.Student;
import com.example.greetingapi.repository.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository repository;
	
	StudentService(StudentRepository repository){
		this.repository = repository;
	}
	
    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student updateStudent(int id, Student student) {

        Student existingStudent = repository.findById(id).orElse(null);
        if(existingStudent != null) {
        	existingStudent.setName(student.getName());
        	existingStudent.setCourse((student.getCourse()));
        	
        	return repository.save(existingStudent);
        }
        return null;
    }

    public String deleteStudent(int id) {

        if(repository.existsById(id)) {
        	repository.deleteById(id);
        	return "Student deleted successfully";
        }

        return "Student not found";
    }
}

