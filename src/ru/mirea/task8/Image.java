package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Image extends JComponent {
    java.awt.Image image;
    public Image(){
        ArrayList<java.awt.Image> images = new ArrayList<>();
        File[] files = new File("C:/Users/shahboz/Downloads/Images").listFiles();
        for(File f : files) {
            images.add(new ImageIcon(f.getAbsolutePath()).getImage());
        }
        image = images.get(0);
        int i = 0;
        JFrame frame = new JFrame();
        frame.add(this);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        while (true){
            try
            {
                image = images.get(i);
                this.repaint();
                Thread.sleep(90);
                if(i<4)
                    i++;
                else
                    i = 0;
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }

    }
    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D)g;
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        gr.drawImage(image, 0, 0,null);
    }

}