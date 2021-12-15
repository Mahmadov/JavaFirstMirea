package ru.mirea.task5;
public abstract class Dog {
    public String name, color;
    public int age;
    public abstract int getAge();
    public abstract String getName();
    public abstract String getColor();
    public abstract void infoDisplay();
}