package ru.mirea.task4;

public class TestAuthor {
    public static void main(String [] args){
        Author ob1 = new Author("shahboz", "aminov1232@gamil.com", 'M');
        Author ob2 = new Author("bahrom", "bahrom1232@gamil.com", 'M');
        Author ob3 = new Author("sorbon", "sorbon@gamil.com", 'M');
        System.out.println(ob1);
        ob1.setName("bahriddin");
        System.out.println(ob1);
    }
}