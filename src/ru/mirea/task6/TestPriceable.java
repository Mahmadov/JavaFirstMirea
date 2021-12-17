package ru.mirea.task6;

public class TestPriceable {
    public static void main(String[] args){
        Laptop ob1 = new Laptop(400, "Lenovo");
        Smartphone ob2 = new Smartphone(200, "Sumsung");
        System.out.println(ob1.getName());
        System.out.println(ob1.getPrice()+"$");
        System.out.println(ob2.getName());
        System.out.println(ob2.getPrice()+"$");
    }
}