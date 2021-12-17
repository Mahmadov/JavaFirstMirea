package ru.mirea.task6;

class Dog implements Nameable {
    public String name;
    Dog(String name){
        this.name = name;
    }
    public String getName(){
        //System.out.println(name);
        return name;
    }
}