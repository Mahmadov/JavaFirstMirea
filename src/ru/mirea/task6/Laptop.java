package ru.mirea.task6;

class Laptop implements Priceable{
    public int p;
    public String name;
    Laptop(int p, String name){
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