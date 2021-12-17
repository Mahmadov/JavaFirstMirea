package ru.mirea.task6;
public class TestNameable {
    public static void main(String [] args){
        Nameable nameable = new Cat("cat");
        System.out.println(nameable.getName());
        nameable = new Dog("dog");
        System.out.println(nameable.getName());
    }
}