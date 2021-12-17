package ru.mirea.task8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Rectangle extends Shape{


    Rectangle(int x1, int y1, int x2, int y2, String color) {
        super(x1, y1, x2, y2, color);
    }
    public void paintComponent(Graphics g){
        this.setBackground(Color.BLACK);
        int r1 = (int) (Math.random() * 255);
        int b1 = (int) (Math.random() * 255);
        int g1 = (int) (Math.random() * 255);
        g.setColor(new Color(r1,g1,b1));
        g.fillRect(0,0, 60,70);

    }

}