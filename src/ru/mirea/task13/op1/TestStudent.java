package ru.mirea.task13.op1;

import java.util.ArrayList;
public class TestStudent {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Student> ar = new ArrayList<Student>(size);
        for (int i = 0; i < size; ++i) {
            Student item = new Student(i, "Student"+i);
            ar.add(item);
        }
        for (Student c: ar){
            System.out.println(c);
        }
        System.out.println(ar.get(2));
    }
}