package ru.mirea.task5;

public class Glass extends Dish {
    public int size;
    public Glass(String color, int prise, int size) {
        super(color, prise);
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    public void infoDisplay(){
        System.out.println("стакан");
        System.out.println("цвет:"+color+" "+"цена:"+ prise+" "+"размер:"+ size);
    }
}