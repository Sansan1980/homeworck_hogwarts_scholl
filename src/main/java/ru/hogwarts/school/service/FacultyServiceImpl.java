package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.modell.Faculty;
import ru.hogwarts.school.modell.dto.FacultyDTO;
import ru.hogwarts.school.service.mapping.FacultyMapper;

import java.util.HashMap;
import java.util.Map;

@Service
public class FacultyServiceImpl implements FacultyService {

    private  Long keyFacultyMap = 0L;

    private Map<Long, Faculty> facultyMap = new HashMap<>();
    private FacultyMapper facultyMapper = new FacultyMapper();

    public FacultyDTO addFaculty(Faculty faculty) {
        if (facultyMap.size() >= 10) {
            return null;//"Превышен лемит количества факультетов"
        }
        for (Faculty bustingFaculty : facultyMap.values()) {
            if (bustingFaculty.getIdFronta().equals(faculty.getIdFronta())) {
                return null;//"такой факультет уже существует"
            }
        }
        keyFacultyMap++;
        faculty.setKeyIdFacultyMap(keyFacultyMap);
        facultyMap.put(keyFacultyMap, faculty);
        faculty = facultyMap.get(keyFacultyMap);
        return facultyMapper.toDto(faculty);
    }

    public FacultyDTO findFaculty(Long keyIdFacultyMap) {

        if (!facultyMap.containsKey(keyIdFacultyMap)) {
            return null;// нет такого факультета
        }
        Faculty faculty = facultyMap.get(keyIdFacultyMap);
        System.out.println("Данный id соответствует факультету - " + faculty);
        return facultyMapper.toDto(faculty);
    }

    public FacultyDTO updateFaculty(Faculty facultyNew) {// Предпологается что обьект facultyNew придет с измененым полем, но старым ключом от мапы.
        Long keyIdFacultyMap = facultyNew.getKeyIdFacultyMap();//вытаскиваем старый ключ в локальную переменную
        if (!facultyMap.containsKey(keyIdFacultyMap)) {
            return null;//нет такого фаультета
        }
        System.out.println("Данные Факультета - " + facultyMap.get(keyIdFacultyMap) + ", Изменены на -");
        facultyMap.put(keyIdFacultyMap, facultyNew);
        Faculty faculty = facultyMap.get(keyIdFacultyMap);//явная проверка вызовом из мапы по keyIdFacultyMap
        System.out.print(faculty);
        return facultyMapper.toDto(faculty);
    }

    public FacultyDTO deleteFaculty(Long keyIdFacultyMap) {
        if (!facultyMap.containsKey(keyIdFacultyMap)) {
            return null;// нет такого факультета.
        }
        Faculty faculty = facultyMap.remove(keyIdFacultyMap);
        System.out.println("Удален факультет - " + faculty);
        return facultyMapper.toDto(faculty);
    }

    @Override
    public String printFacultyMap() {
        return facultyMap.toString();
    }

}
