package ru.mirea.task7;
public class Square extends Shape{
    protected double side;
    public Square(){
        this.filled = false;
        this.color = "blue";
        side = 1;
    }
    Square(double side){
        this.filled = false;
        this.color = "blue";
        this.side = side;
    }
    Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    double getSide(){
        return side;
    }
    void setSide(double side){
        this.side = side;
    }
    void setWidth(double side){
        this.side = side;
    }
    void setLength(double side){
        this.side = side;
    }
    double getArea(){
        return side*side;
    }
    double getPerimeter(){
        return 4*side;
    }
    public String toString(){
        return "Square: square, side: "+this.side;
    }
}