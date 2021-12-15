package ru.mirea.task5;

public abstract class Dish {
    public String color;
    public int prise;
    public Dish(String color, int prise){
        this.color = color;
        this.prise = prise;
    }
    public static void main(String [] args){

    }
    public abstract int getSize();
    public abstract void infoDisplay();
}