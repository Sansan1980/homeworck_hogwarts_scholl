package ru.hogwarts.school.service;

import org.springframework.web.bind.annotation.PathVariable;
import ru.hogwarts.school.modell.Faculty;
import ru.hogwarts.school.modell.Student;
import ru.hogwarts.school.modell.dto.FacultyDTO;

import java.util.Map;

public interface FacultyService {
    FacultyDTO addFaculty(Faculty faculty);

    FacultyDTO findFaculty(Long keyIdFacultyMap);

    FacultyDTO updateFaculty(Faculty facultyNew);

    FacultyDTO deleteFaculty(Long id);

   String printFacultyMap();
}
