package com.example.demo.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Marks;
import com.example.demo.domain.Student;
import com.example.demo.repository.MarksRepository;
import com.example.demo.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentRepository studentRepo;
    private final MarksRepository marksRepo;

    public StudentController(StudentRepository studentRepo, MarksRepository marksRepo) {
        this.studentRepo = studentRepo;
        this.marksRepo = marksRepo;
    }

    // Create a student with total marks
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
    	System.out.println(student.getName());
    	System.out.println(student.getStuId());
    	System.out.println(student.gettMarks());
        return studentRepo.save(student);
    }

    // Add a mark for a student
    @PostMapping("/students/{stuid}/marks")
    public Marks addMark(@PathVariable Long stuid, @RequestBody Marks mark) {
        Student student = studentRepo.findById(stuid).orElseThrow();
        mark.setStudent(student);
        return marksRepo.save(mark);
    }

    // Get all marks for a student
    @GetMapping("/students/{stuid}/marks")
    public List<Marks> getStudentMarks(@PathVariable Long stuid) {
        Student student = studentRepo.findById(stuid).orElseThrow();
        return student.getMarks();
    }
}