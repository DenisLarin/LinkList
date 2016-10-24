package ru.larin.main;

import ru.larin.OneWayList.Node;
import ru.larin.OneWayList.OneWayList;

import java.util.ArrayList;

/**
 * Created by mrden on 24.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        OneWayList oneWayList = new OneWayList();
        Student[] students = new Student[2];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            oneWayList.add(students[i]);
        }
        oneWayList.printList();
    }
}
