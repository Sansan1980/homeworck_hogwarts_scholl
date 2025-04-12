package ru.hogwarts.school.modell;

public class Faculty {
    private Long id;
    private String name;
    private String color;
    private long counter;


    public  Faculty(Long id, String name, String color) {
        this.id = counter++;
        this.name = name;
        this.color = color;
    }
}
