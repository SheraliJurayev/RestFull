package com.example.springboot.web.rest;


import com.example.springboot.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentResource {

    @GetMapping("/students")
    public ResponseEntity getAll(){
        Student student = new Student(1L, "Sari", "Aliyev" , "4-kurs");
        Student student1 = new Student(2L, "El", "Jo'rayev" , "1-kurs");
        Student student2 = new Student(3L, "Shef", "Valiyev" , "2-kurs");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        return ResponseEntity.ok(students);

    }


}
