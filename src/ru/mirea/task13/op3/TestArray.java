package ru.mirea.task13.op3;
public class TestArray {
    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<>();
        myArray.add(5);
        myArray.add(20);
        myArray.add(25);
        myArray.add(35);
        System.out.println(myArray);
        System.out.println();
        myArray.delete(0);
        myArray.set(1, 50);
        System.out.println(myArray);
    }
}