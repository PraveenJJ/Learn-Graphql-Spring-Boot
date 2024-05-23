package com.learning.demo.service;

import com.learning.demo.repository.StudentRegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import com.learning.demo.model.Student;

@Service
public class StudentRegistryRestService implements IStudentRegistryRestService {

    @Autowired
    private StudentRegistryRepository repository;

    @Override
    public List<Student> fetchStudents() {
        return this.repository.findAll();
    }

    @Override
    public Student enrollStudent(Student student) {
        return this.repository.save(student);
    }

    @Override
    public Student studentById(UUID id) {
        Optional<Student> optional = this.repository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

    @Override
    public Student updateStudent(Student student) {
        return this.repository.save(student);
    }

    @Override
    public Boolean removeStudent(UUID id) {
        this.repository.deleteById(id);
        return true;
    }

}
