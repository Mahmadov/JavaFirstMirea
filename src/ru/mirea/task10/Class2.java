package ru.mirea.task10;

public class Class2 {
    int i = 1;
    public int Num(int n){
        if(i == n)
            return i;
        System.out.println(i);
        i++;
        return Num(n);
    }
    public static void main(String[] args){
        Class2 ob = new Class2();
        System.out.println(ob.Num(6));
    }
}