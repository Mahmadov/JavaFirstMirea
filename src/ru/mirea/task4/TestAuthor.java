package ru.mirea.task4;

public class TestAuthor {
    public static void main(String [] args){
        Author ob1 = new Author("Franko", "iiejy7f@gmail.com", 'M');
        Author ob2 = new Author("Jime", "elf022@gmail.com", 'M');
        Author ob3 = new Author("Jack", "werj911@gmail.com", 'M');
        System.out.println(ob1);
        ob1.setName("Alucard");
        System.out.println(ob1);
    }
}