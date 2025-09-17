package se.mojujo.web_services_spring_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.mojujo.web_services_spring_4.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findById(long id);
}
