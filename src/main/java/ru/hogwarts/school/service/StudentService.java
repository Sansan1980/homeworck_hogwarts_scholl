package ru.hogwarts.school.service;

import ru.hogwarts.school.modell.Student;
import ru.hogwarts.school.modell.dto.StudentDTO;

import java.util.HashMap;
import java.util.Map;

public interface StudentService {
    StudentDTO addStudent(Student student);

    StudentDTO findStudent(Long keyIdStudentMap);

    StudentDTO updateStudent(Student studentNew);

    StudentDTO deleteStudent(Long id);

    String printStudentMap();


}
