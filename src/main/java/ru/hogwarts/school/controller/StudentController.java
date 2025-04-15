package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.modell.Student;
import ru.hogwarts.school.modell.dto.StudentDTO;
import ru.hogwarts.school.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentServiceImpl studentServiceImpl;

    public StudentController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @PostMapping("/addStudent")
    public ResponseEntity<StudentDTO> addStudent(@RequestBody Student student) {
        return ResponseEntity.status(201).body(studentServiceImpl.addStudent(student));
        //return studentServiceImpl.addstudent(student);
    }

    @GetMapping("/findStudent/{id}")
    public StudentDTO findStudent(@RequestParam (value = "id",required = false)Long keyIdStudentMap) {
        return studentServiceImpl.findStudent(keyIdStudentMap);
    }

    @PutMapping("/updateStudent")
    public StudentDTO updateStudent(@RequestBody Student studentNew) {
        return studentServiceImpl.updateStudent(studentNew);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public StudentDTO deleteStudent(@PathVariable Long keyIdStudentMap) {
        return studentServiceImpl.deleteStudent(keyIdStudentMap);
    }
    @GetMapping("/printStudentMap")
    public String printStudentMap() {
        return studentServiceImpl.printStudentMap();
    }
}


