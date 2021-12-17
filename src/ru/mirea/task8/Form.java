package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;
public class Form extends JFrame {
    public Form(){
        JPanel[] pnl = new JPanel[20];
        setLayout(new GridLayout(4,5));
        for(int i = 0; i<20; i++)
        {
            double n = (int) (Math.random() * 250);
            if(n>0 && n<100)
                add(new Rectangle(0,0,10,20, "green"));
            if(n>=100 && n<180)
                add(new Circle(0,0,10,20, "green"));
            if(n>=180 && n<250)
                add(new Triangle(0,0,10,20, "green"));
        }
        setSize(500,500);

    }
}