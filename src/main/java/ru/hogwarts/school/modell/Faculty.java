package ru.hogwarts.school.modell;

import java.util.Objects;

public class Faculty {
    private Long idFronta;//пришло с фронта
    private Long keyIdFacultyMap;//ключь мапы + сколько добавленно в мапу
    private Long counterFaculty = 0L;//сколько созданно обьеков класса
    private String facultyName;
    private String facultyColor;
    private String facultySpecialization;
    private Long counter = 0L;

    public Faculty() {

    }


    public Faculty(Long id, String name, String color, String specialization) {
        this.idFronta = id;
        this.counterFaculty = counter++;//не инкрементирует через браузер , только через new и явного обращения к конструктору класса
        this.facultyName = name;
        this.facultyColor = color;
        this.facultySpecialization = specialization;
    }

    public Long getIdFronta() {
        return idFronta;
    }

    public void setIdFronta(Long idFronta) {
        this.idFronta = idFronta;
    }

    public Long getCounterFaculty() {
        return counterFaculty;
    }

    public void setCounterFaculty(Long counterFaculty) {
        this.counterFaculty = counterFaculty;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyColor() {
        return facultyColor;
    }

    public void setFacultyColor(String facultyColor) {
        this.facultyColor = facultyColor;
    }

    public String getFacultySpecialization() {
        return facultySpecialization;
    }

    public void setFacultySpecialization(String facultySpecialization) {
        this.facultySpecialization = facultySpecialization;
    }

    public Long getKeyIdFacultyMap() {
        return keyIdFacultyMap;
    }

    public void setKeyIdFacultyMap(Long keyFacultyMap) {
        this.keyIdFacultyMap = keyFacultyMap;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "keyIdFacultyMap=" + keyIdFacultyMap +
                ", facultyId=" + counterFaculty +
                ", facultyName='" + facultyName + '\'' +
                ", facultyColor='" + facultyColor + '\'' +
                ", facultySpecialization='" + facultySpecialization + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty faculty)) return false;
        return getKeyIdFacultyMap() == faculty.getKeyIdFacultyMap() && Objects.equals(getCounterFaculty(), faculty.getCounterFaculty()) && Objects.equals(getFacultyName(), faculty.getFacultyName()) && Objects.equals(getFacultyColor(), faculty.getFacultyColor()) && Objects.equals(getFacultySpecialization(), faculty.getFacultySpecialization());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKeyIdFacultyMap(), getCounterFaculty(), getFacultyName(), getFacultyColor(), getFacultySpecialization());
    }
}
