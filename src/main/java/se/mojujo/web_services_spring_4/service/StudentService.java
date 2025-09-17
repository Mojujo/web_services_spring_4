package se.mojujo.web_services_spring_4.service;

import org.springframework.stereotype.Service;
import se.mojujo.web_services_spring_4.repository.StudentRepository;
import java.util.HashMap;


@Service
public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    HashMap<Long, String> student = new HashMap<>();
}
