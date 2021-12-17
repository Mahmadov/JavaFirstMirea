package ru.mirea.task7;
public abstract class Shape {
    protected boolean filled;
    protected String color;
    Shape(){
    }
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return color;
    }
    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean filled){
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
}