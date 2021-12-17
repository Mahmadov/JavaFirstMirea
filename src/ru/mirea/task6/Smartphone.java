package ru.mirea.task6;

public class Smartphone implements Priceable {
    public int p;
    public String name;
    Smartphone(int p, String name){
        this.p = p;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return p;
    }
}
