package ru.mirea.task2;
public class Book {
    private String Author, name;
    private int prise;
    Book(String Author, String name, int prise){
        this.Author = Author;
        this.name = name;
        this.prise = prise;
    }
    public String getAuthor(String Author){
        return Author;
    }
    public String getName(String name){
        return name;
    }
    public void setPrise(int prise){
        this.prise = prise;
    }
    public int getPrise(int prise){
        return prise;
    }
    public void infoDisplay(){
        System.out.println("Имя автора: "+Author+" "+ "название книги:"+ name+" "+ "цена книги: "+ prise);
    }
    public static void main(String[] arg){
        Book ob1 = new Book("Muhammad", "Life", 365);
        ob1.infoDisplay();
        ob1.setPrise(543);
        ob1.infoDisplay();
    }
}