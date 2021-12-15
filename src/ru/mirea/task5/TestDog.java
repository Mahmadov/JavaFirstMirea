package ru.mirea.task5;

public class TestDog {
    public static void main(String[] args){
        BreedA ob1 = new BreedA();
        ob1.setName("Алмос");
        ob1.setAge(10);
        ob1.setColor("серый");
        ob1.infoDisplay();
        ob1.Command();
        BreedB ob2 = new BreedB();
        ob2.setName("Джек");
        ob2.setAge(9);
        ob2.setColor("желтый");
        ob2.infoDisplay();
    }
}