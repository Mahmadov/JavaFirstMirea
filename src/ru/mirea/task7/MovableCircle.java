package ru.mirea.task7;

public class MovableCircle extends MovablePoint implements Movable  {
    public int radius;
    MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x,y,xSpeed,ySpeed);
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    boolean s1, s2,s3, s4;
    public void moveUp(){
        y = y + ySpeed;
        s1 = true;
    }
    public void moveDown(){
        y = y - ySpeed;
        s2 = true;
    }
    public void moveLeft(){
        x = x - xSpeed;
        s3 = true;
    }
    public void moveRight(){
        x = x + xSpeed;
        s4 = true;
    }
    public String toString(){
        String s = "";
        if(s1 == true){
            s = "move up";
        }
        if(s2 == true){
            s = "move Down";
        }
        if(s3 == true){
            s = "move left";
        }
        if(s4 == true){
            s = "move right";
        }
        return s;
    }
}