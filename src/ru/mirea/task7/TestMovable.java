package ru.mirea.task7;

public class TestMovable {
    public static void main(String[] args){
        MovablePoint ob1 = new MovablePoint(1,2,3, 4);
        System.out.println(ob1.x + " " + ob1.y);
        ob1.moveDown();
        System.out.println(ob1.toString());
        System.out.println("скорость по x: "+ob1.xSpeed);
        System.out.println("скорость по y: "+ob1.ySpeed);
        System.out.println(ob1.x + " " + ob1.y);
        MovableCircle ob2 = new MovableCircle(1,2,5,3, 6);
        ob2.moveRight();
        System.out.println("скорость по x: "+ob2.xSpeed);
        System.out.println("скорость по y: "+ob2.ySpeed);
        System.out.println(ob2.x + " " + ob2.y);
    }
}