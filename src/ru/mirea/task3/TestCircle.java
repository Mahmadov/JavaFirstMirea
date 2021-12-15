package ru.mirea.task3;

public class TestCircle {
    public static void main(String[] arg){
        Circle ob1 = new Circle(5);
        ob1.Length();
        ob1.Area();
        ob1.setRadius(10);
        ob1.Area();
    }
}