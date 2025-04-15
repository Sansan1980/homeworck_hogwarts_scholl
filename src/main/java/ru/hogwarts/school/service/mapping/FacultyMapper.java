package ru.hogwarts.school.service.mapping;

import ru.hogwarts.school.modell.Faculty;
import ru.hogwarts.school.modell.dto.FacultyDTO;

public class FacultyMapper {
    public FacultyDTO toDto(Faculty faculty) {
        if (faculty == null) {
            return null;
        }
        FacultyDTO dto = new FacultyDTO();
        dto.setIdFrontaDTO(faculty.getIdFronta());
        dto.setKeyIdFacultyMapDTO(faculty.getKeyIdFacultyMap());
        dto.setCounterFacultyDTO(faculty.getCounterFaculty());
        dto.setNameFacultyDTO(faculty.getFacultyName());
        return dto;
    }

    public Faculty facultyDtoToEntity(FacultyDTO dto) {
        if (dto == null) {
            return null;//? надо ошибку кидать?
        }
        Faculty faculty = new Faculty();//переделать на faculty из мапы сервиса(репозитория)по ключу
        faculty.setIdFronta(dto.getIdFrontaDTO());
        faculty.setKeyIdFacultyMap(dto.getKeyIdFacultyMapDTO());
        faculty.setCounterFaculty(dto.getCounterFacultyDTO());
        faculty.setFacultyName(dto.getNameFacultyDTO());
        return faculty;
    }
}
