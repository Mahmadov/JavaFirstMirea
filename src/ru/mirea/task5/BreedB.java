package ru.mirea.task5;
public class BreedB extends Dog {
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return null;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor() {
        return null;
    }
    public void infoDisplay() {
        System.out.println("Имя: "+ name+" "+"цвет: "+color+" "+"возраст: "+age);
    }
}