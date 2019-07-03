package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("Frank", "Derk"));
        students.add(new Student("Mari", "Rossi"));
        students.add(new Student("Mary", "Smith"));
    }

    @GetMapping("/students")
    public List<Student> studentList() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return students.get(studentId);
    }

}
