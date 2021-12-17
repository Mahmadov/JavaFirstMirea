package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class Circle extends Shape {

    Circle(int x1, int y1, int x2, int y2, String color) {
        super(x1, y1, x2, y2, color);

    };

    public void paintComponent(Graphics g){
        this.setBackground(Color.BLACK);
        int r2 = (int) (Math.random() * 255);
        int b2 = (int) (Math.random() * 255);
        int g2 = (int) (Math.random() * 255);
        g.fillOval(0,0,50,50);
    }
}