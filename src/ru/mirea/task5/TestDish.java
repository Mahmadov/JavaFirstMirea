package ru.mirea.task5;
public class TestDish {
    public static void main(String[] args){
        Cup ob1 = new Cup("white", 100, 60);
        ob1.color = "green";
        ob1.infoDisplay();
        Glass ob2 = new Glass("red", 200, 50);
        ob2.infoDisplay();
    }
}