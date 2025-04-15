package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.modell.Student;
import ru.hogwarts.school.modell.dto.StudentDTO;
import ru.hogwarts.school.service.mapping.StudentMapper;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    private Long keyStudentMap = 0L;

    private Map<Long, Student> studentMap = new HashMap<>();
    private StudentMapper studentMapper = new StudentMapper();

    public StudentDTO addStudent(Student student) {

        if (studentMap.size() >= 10) {
            return null;//"Превышен лемит количества факультетов"
        }
        for (Student bustingStudent : studentMap.values()) {
            if (bustingStudent.getIdFronta().equals(student.getIdFronta())) {
                return null;//"такой факультет уже существует"
            }
        }
        keyStudentMap++;
        student.setKeyIdStudentMap(keyStudentMap);
        studentMap.put(keyStudentMap, student);
        student = studentMap.get(keyStudentMap);
        return studentMapper.toDto(student);
    }

    public StudentDTO findStudent(Long keyIdStudentMap) {

        if (!studentMap.containsKey(keyIdStudentMap)) {
            return null;// нет такого факультета
        }
        Student student = studentMap.get(keyIdStudentMap);
        System.out.println("Данный id соответствует факультету - " + student);
        return studentMapper.toDto(student);
    }

    public StudentDTO updateStudent(Student studentNew) {// Предпологается что обьект studentNew придет с измененым полем, но старым ключом от мапы.
        Long keyIdStudentMap = studentNew.getKeyIdStudentMap();//вытаскиваем старый ключ в локальную переменную
        if (!studentMap.containsKey(keyIdStudentMap)) {
            return null;//нет такого фаультета
        }
        System.out.println("Данные Факультета - " + studentMap.get(keyIdStudentMap) + ", Изменены на -");
        studentMap.put(keyIdStudentMap, studentNew);
        Student student = studentMap.get(keyIdStudentMap);//явная проверка вызовом из мапы по keyIdstudentMap
        System.out.print(student);
        return studentMapper.toDto(student);
    }

    public StudentDTO deleteStudent(Long keyIdStudentMap) {
        if (!studentMap.containsKey(keyIdStudentMap)) {
            return null;// нет такого факультета.
        }
        Student student = studentMap.remove(keyIdStudentMap);
        System.out.println("Удален факультет - " + student);
        return studentMapper.toDto(student);
    }

    @Override
    public String printStudentMap() {
        return studentMap.toString();
    }

}