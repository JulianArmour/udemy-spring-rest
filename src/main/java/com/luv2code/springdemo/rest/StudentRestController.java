package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @GetMapping("/students")
    public List<Student> studentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Frank", "Derk"));
        students.add(new Student("Mari", "Rossi"));
        students.add(new Student("Mary", "Smith"));
        return students;
    }
}
