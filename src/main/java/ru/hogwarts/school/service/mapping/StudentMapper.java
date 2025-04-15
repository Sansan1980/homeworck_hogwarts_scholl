package ru.hogwarts.school.service.mapping;

import ru.hogwarts.school.modell.Student;
import ru.hogwarts.school.modell.dto.StudentDTO;

public class StudentMapper {
    public StudentDTO toDto(Student student) {
        if (student == null) {
            return null;
        }
        StudentDTO dto = new StudentDTO();
        dto.setIdFrontaDTO(student.getIdFronta());
        dto.setKeyIdStudentMapDTO(student.getKeyIdStudentMap());
        dto.setCounterStudentDTO(student.getCounterStudent());
        dto.setNameStudentDTO(student.getStudentName());
        return dto;
    }

    public Student studentDtoToEntity(StudentDTO dto) {
        if (dto == null) {
            return null;//? надо ошибку кидать?
        }
        Student student = new Student();//переделать на faculty из мапы сервиса(репозитория)по ключу
        student.setIdFronta(dto.getIdFrontaDTO());
        student.setKeyIdStudentMap(dto.getKeyIdStudentMapDTO());
        student.setCounterStudent(dto.getCounterStudentDTO());
        student.setStudentName(dto.getNameStudentDTO());
        return student;
    }
}

