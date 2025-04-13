package ru.hogwarts.school.service;

import ru.hogwarts.school.modell.Student;
import ru.hogwarts.school.modell.dto.StudentDTO;

import java.util.HashMap;
import java.util.Map;

public interface StudentService {
    StudentDTO addStudente(Student student) ;
    StudentDTO findStudente(Long id);

    StudentDTO updateStudent(long id,String string);

    StudentDTO deleteStudent(long id);
    Map<Long,Student> printStudentMap();

}
