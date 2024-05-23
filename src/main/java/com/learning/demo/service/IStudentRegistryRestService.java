package com.learning.demo.service;

import java.util.List;
import java.util.UUID;
import com.learning.demo.model.Student;

public interface IStudentRegistryRestService {

    List<Student> fetchStudents();

    Student enrollStudent(Student student);

    Student studentById(UUID id);

    Student updateStudent(Student student);

    Boolean removeStudent(UUID id);

}
