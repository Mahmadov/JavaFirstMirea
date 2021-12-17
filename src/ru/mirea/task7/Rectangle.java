package ru.mirea.task7;

public class Rectangle extends Shape {
    protected double length, width;
    Rectangle(){
        this.length = 5;
        this.width = 3;
        this.color = "green";
        this.filled = false;
    }
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.color = "green";
        this.filled = false;

    }
    Rectangle(double length, double width, String color, boolean filled){
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }
    double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    double getArea(){
        return length*width;
    }
    double getPerimeter(){
        return 2*(length + width);
    }
    public String toString(){
        return "Shape: rectangle, length: "+this.length+", width: "+this.width;
    }
}