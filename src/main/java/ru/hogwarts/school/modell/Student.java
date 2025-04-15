package ru.hogwarts.school.modell;

import java.util.Objects;

public class Student {
    private Long idFronta;//пришло с фронта
    private Long keyIdStudentMap;//ключь мапы + сколько добавленно в мапу
    private Long counterStudent = 0L;//сколько созданно обьеков класса
    private String studentName;
    private String studentColor;
    private String studentSpecialization;
    private Long counter = 0L;

    public Student() {
    }

    public Student(Long idFronta, Long keyIdStudentMap, Long counterStudent, String studentName, String studentColor, String studentSpecialization) {
        this.idFronta = idFronta;
        this.keyIdStudentMap = keyIdStudentMap;
        this.counterStudent = counter++;
        this.studentName = studentName;
        this.studentColor = studentColor;
        this.studentSpecialization = studentSpecialization;

    }

    public Long getIdFronta() {
        return idFronta;
    }

    public void setIdFronta(Long idFronta) {
        this.idFronta = idFronta;
    }

    public Long getKeyIdStudentMap() {
        return keyIdStudentMap;
    }

    public void setKeyIdStudentMap(Long keyIdStudentMap) {
        this.keyIdStudentMap = keyIdStudentMap;
    }

    public Long getCounterStudent() {
        return counterStudent;
    }

    public void setCounterStudent(Long counterStudent) {
        this.counterStudent = counterStudent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentColor() {
        return studentColor;
    }

    public void setStudentColor(String studentColor) {
        this.studentColor = studentColor;
    }

    public String getStudentSpecialization() {
        return studentSpecialization;
    }

    public void setStudentSpecialization(String studentSpecialization) {
        this.studentSpecialization = studentSpecialization;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idFronta=" + idFronta +
                ", keyIdStudentMap=" + keyIdStudentMap +
                ", counterStudent=" + counterStudent +
                ", studentName='" + studentName + '\'' +
                ", studentColor='" + studentColor + '\'' +
                ", studentSpecialization='" + studentSpecialization + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getIdFronta(), student.getIdFronta()) && Objects.equals(getKeyIdStudentMap(), student.getKeyIdStudentMap()) && Objects.equals(getCounterStudent(), student.getCounterStudent()) && Objects.equals(getStudentName(), student.getStudentName()) && Objects.equals(getStudentColor(), student.getStudentColor()) && Objects.equals(getStudentSpecialization(), student.getStudentSpecialization());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdFronta(), getKeyIdStudentMap(), getCounterStudent(), getStudentName(), getStudentColor(), getStudentSpecialization());
    }
}
