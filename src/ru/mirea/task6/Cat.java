package ru.mirea.task6;
class Cat implements Nameable{
    public String name;
    Cat(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}