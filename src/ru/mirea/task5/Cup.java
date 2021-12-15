package ru.mirea.task5;

public class Cup extends Dish {
    public int size;
    public Cup(String color, int prise, int size) {
        super(color, prise);
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    public void infoDisplay(){
        System.out.println("чашка");
        System.out.println("цвет:"+ color+" " + "цена:"+" "+ prise+" "+"размер:"+ size);
    }
}