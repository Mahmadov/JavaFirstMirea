package ru.mirea.task7;
public class TestShape {
    public static void main(String[] args){
        Square ob1 = new Square(5);
        Circle ob2 = new Circle(6);
        System.out.println(ob2.getPerimeter());
        System.out.println(ob1.getColor());
        Square ob3 = new Square(5,"green",true);
        System.out.println(ob3.getColor());
        System.out.println(ob1.getArea());
        System.out.println(ob2.getArea());
        System.out.println(ob1.isFilled());
        Rectangle ob4 = new Rectangle(10, 15);
        System.out.println(ob4.getArea());

    }
}
