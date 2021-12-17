package ru.mirea.task13.op2;
import ru.mirea.task13.opt1.Student;

import java.util.LinkedList;

public class TestStudent {
    public static void main(String[] args) {
        int size = 5;
        LinkedList<Student> list = new LinkedList<Student>();
        for (int i = 0; i < size; ++i) {
            Student ob1 = new Student(i, "Student"+i);
            list.add(ob1);
        }
        for (Student c: list){
            System.out.println(c);
        }
        Student ob2 = new Student(4, "shahboz");
        Student ob3 = new Student(4, "saidamin");
        list.add(3, ob2);
        list.add(ob3);
        for (Student c: list){
            System.out.println(c);
        }
    }
}