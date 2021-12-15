package ru.mirea.task3;

public class Circle {
    public int r;
    public double l, s;
    Circle(int r){
        this.r = r;
    }
    public void setRadius(int r){
        this.r = r;
    }
    public int getRadius(int r){
        return r;
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