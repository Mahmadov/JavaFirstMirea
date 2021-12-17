package ru.mirea.task8;

import javax.swing.*;

public abstract class Shape extends JPanel {
    public int x1, x2, y1, y2;
    public String color;
    Shape(int x1, int y1, int x2, int y2, String color){
        this.color = color;
        this.x1 = x1;
        this.y1= y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}