package ru.mirea.task13.opt2;
public class Student {
    public int id;
    public String name;
    public Student(){
        id = 0;
        name = "";
    }
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "{" + "id=" + id + ", name is: " + name + '}';
    }
}