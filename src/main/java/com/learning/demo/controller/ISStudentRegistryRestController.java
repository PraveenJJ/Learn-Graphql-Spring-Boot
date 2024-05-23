package com.learning.demo.controller;

import com.learning.demo.model.Student;

import java.util.List;
import java.util.UUID;

public interface ISStudentRegistryRestController {

    List<Student> fetchStudents();

    Student enrollStudent(Student student);

    Student studentById(UUID id);

    Student updateStudent(Student student);

    Boolean removeStudent(UUID id);

}
