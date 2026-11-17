package com.example.greetingapi.StudentService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.greetingapi.Student;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student updateStudent(int id, Student updatedStudent) {

        for (Student student : students) {

            if (student.getId() == id) {

                student.setName(updatedStudent.getName());
                student.setCourse(updatedStudent.getCourse());

                return student;
            }
        }

        return null;
    }

    public boolean deleteStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                students.remove(student);
                return true;
            }
        }

        return false;
    }
}

