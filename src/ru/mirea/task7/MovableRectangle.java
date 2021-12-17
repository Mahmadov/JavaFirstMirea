package ru.mirea.task7;

public class MovableRectangle extends MovablePoint implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;
    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        super(x1, y2, xSpeed,ySpeed);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
}