package com.learning.demo.controller;

import com.learning.demo.model.Student;
import com.learning.demo.service.IStudentRegistryRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Controller
public class StudentGraphqlAPI {

    @Autowired
    private IStudentRegistryRestService service;

    @QueryMapping
    public List<Student> fetchStudents() {
        return this.service.fetchStudents();
    }

    @MutationMapping
    public Student enrollStudent(@Argument UUID id, @Argument String name, @Argument Integer age, @Argument String grade) {
        return this.service.enrollStudent(new Student(id, name, age, grade));
    }

    @QueryMapping
    public Student studentById(@Argument UUID id) {
        return this.service.studentById(id);
    }

    @MutationMapping
    public Student updateStudent(@Argument UUID id, @Argument String name, @Argument Integer age, @Argument String grade) {
        return this.service.updateStudent(new Student(id, name, age, grade));
    }

    @MutationMapping
    public Boolean removeStudent(@Argument UUID id) {
        return this.service.removeStudent(id);
    }

}
