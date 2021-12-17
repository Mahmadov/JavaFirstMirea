package ru.mirea.task8;

import java.awt.*;

public class Triangle extends Shape {

    Triangle(int x1, int y1, int x2, int y2, String color) {
        super(x1, y1, x2, y2, color);
    }

    public void paintComponent(Graphics g) {
        this.setBackground(Color.BLACK);
        int r2 = (int) (Math.random() * 255);
        int b2 = (int) (Math.random() * 255);
        int g2 = (int) (Math.random() * 255);
        int[] x = {10, 60, 40};
        int[] y = {5, 5, 80};
        g.setColor(new Color(r2, g2, b2));
        g.fillPolygon(x, y, 3);
    }
}