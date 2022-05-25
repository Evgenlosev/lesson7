package com.geekbrains.lesson7.controllers;

import com.geekbrains.lesson7.entities.Student;
import com.geekbrains.lesson7.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        System.out.println(studentService.getAllStudents());
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public String getStudentNameById(@PathVariable Long id) {
        return studentService.getNameById(id);
    }

    @GetMapping("/students/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        studentService.deleteById(id);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }
}
