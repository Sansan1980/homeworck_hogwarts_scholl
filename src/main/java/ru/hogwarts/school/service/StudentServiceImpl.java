package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.modell.Student;
import ru.hogwarts.school.modell.dto.StudentDTO;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    private Map<Long, Student> userMap = new HashMap<>();

    public StudentDTO addStudente(Student student) {
        if (userMap.size() >= 10000) {
            return null;//"Превышен лемит количества контрагентов";
        }
        if (userMap.containsKey(student.getId())) {
            return null;//return "Такой контрагент уже существует"
        }
        userMap.put(student.getId(), student);
        Student studentMap = userMap.get(student.getId());
        System.out.println("Введен данные нового студента " + studentMap);
        return null;
    }

    ;

    public StudentDTO findStudente(Long id) {
        return null;
    }

    public StudentDTO updateStudent(long id, String string) {
        return null;
    }

    public StudentDTO deleteStudent(long id) {
        return null;
    }

    public Map<Long, Student> printStudentMap() {
        return null;
    }
}
