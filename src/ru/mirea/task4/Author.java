package ru.mirea.task4;

public class Author {
    private String name, email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(String email){
        return email;
    }
    public void setGender(char gender){
        this.gender = gender;

    }
    public char getGender(char gender){
        return gender;

    }
    public String toString(){
        return this.name+"("+this.gender+")"+ " at " + this.email;
    }

}
