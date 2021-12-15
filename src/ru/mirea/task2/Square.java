package ru.mirea.task2;

public class Square {
    public int a;
    public double s, p;
    public Square(int a){
        this.a = a;
    }
    public void Perimeter(){
        p = 4*a;
        System.out.println(p);
    }
    public void Area(){
        s = a*a;
        System.out.println(s);
    }
}