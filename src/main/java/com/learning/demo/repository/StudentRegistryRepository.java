package com.learning.demo.repository;

import com.learning.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface StudentRegistryRepository extends JpaRepository<Student, UUID> {

}
