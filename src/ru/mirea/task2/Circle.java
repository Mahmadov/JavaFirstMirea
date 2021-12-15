package ru.mirea.task2;

public class Circle {
    public int r;
    public double l, s;
    public Circle(int r){
        this.r = r;
    }
    public void Length(){
        l = 2*3.14*r;
        System.out.println(l);
    }
    public void Area(){
        s = 3.14*r*r;
        System.out.println(s);
    }
}