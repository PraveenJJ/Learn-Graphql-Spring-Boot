package com.learning.demo.controller;

import com.learning.demo.model.Student;
import com.learning.demo.service.IStudentRegistryRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentRegistryRestController implements ISStudentRegistryRestController {

    @Autowired
    private IStudentRegistryRestService service;

    @Override
    @GetMapping
    public List<Student> fetchStudents() {
        return this.service.fetchStudents();
    }

    @Override
    @PostMapping
    public Student enrollStudent(@RequestBody Student student) {
        return this.service.enrollStudent(student);
    }

    @Override
    @GetMapping("/{id}")
    public Student studentById(@PathVariable UUID id) {
        return this.service.studentById(id);
    }

    @Override
    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return this.service.updateStudent(student);
    }

    @Override
    @DeleteMapping("/{id}")
    public Boolean removeStudent(@PathVariable UUID id) {
        return this.service.removeStudent(id);
    }
}
