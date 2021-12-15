package ru.mirea.task2;
public class Shape {
    public static void main(String[] arg){
        Circle ob1 = new Circle(5);
        Square ob2 = new Square(10);
        ob1.Area();
        ob1.Length();
        ob2.Area();
        ob2.Perimeter();
    }
}