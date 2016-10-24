package ru.larin.main;

import java.util.Scanner;

/**
 * Created by mrden on 24.10.2016.
 */
public class Student {
    private String name;
    private int age;
    private Scanner scanner;

    public Student() {
        setName();
        setAge();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName() {
        System.out.println("Введите имя студента");
        scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }

    public void setAge() {
        System.out.println("Введите возраст студента");
        scanner = new Scanner(System.in);
        this.age = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
