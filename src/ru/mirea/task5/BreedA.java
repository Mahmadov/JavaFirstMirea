package ru.mirea.task5;
import java.util.Scanner;
public class BreedA extends Dog {
    public void Command(){
        Scanner in = new Scanner(System.in);
        System.out.print("give a command: ");
        String c = in.nextLine();
        if(c.equals("sit down"))
            System.out.println("ok, I will do it!");
        else
            System.out.println("I can not do it:(");
    }
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