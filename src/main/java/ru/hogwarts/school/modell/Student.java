package ru.hogwarts.school.modell;

public class Student {
    private Long id;
    private String name;
    private int age;
    private long counter;


    public  Student(Long id, String name, int age) {
        this.id = counter++;
        this.name = name;
        this.age = age;
    }
}
