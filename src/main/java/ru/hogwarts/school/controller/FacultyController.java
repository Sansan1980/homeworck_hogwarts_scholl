package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.modell.Faculty;
import ru.hogwarts.school.modell.dto.FacultyDTO;
import ru.hogwarts.school.service.FacultyServiceImpl;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    private FacultyServiceImpl facultyServiceImpl;

    public FacultyController(FacultyServiceImpl facultyServiceImpl) {
        this.facultyServiceImpl = facultyServiceImpl;
    }

    @PostMapping("/addFaculty")
    public ResponseEntity<FacultyDTO> addFaculty(@RequestBody Faculty faculty) {
        return ResponseEntity.status(201).body(facultyServiceImpl.addFaculty(faculty));
        //return facultyServiceImpl.addFaculty(faculty);
    }

    @GetMapping("/findFaculty/{id}")
    public FacultyDTO findFaculty(@RequestParam (value = "id",required = false)Long keyIdFacultyMap) {
        return facultyServiceImpl.findFaculty(keyIdFacultyMap);
    }

    @PutMapping("/updateFaculty")
    public FacultyDTO updateFaculty(@RequestBody Faculty facultyNew) {
        return facultyServiceImpl.updateFaculty(facultyNew);
    }

    @DeleteMapping("/deleteFaculty/{id}")
    public FacultyDTO deleteFaculty(@PathVariable Long keyIdFacultyMap) {
        return facultyServiceImpl.deleteFaculty(keyIdFacultyMap);
    }
    @GetMapping("/printFacultyMap")
     public String printFacultyMap() {
        return facultyServiceImpl.printFacultyMap();
    }
}

