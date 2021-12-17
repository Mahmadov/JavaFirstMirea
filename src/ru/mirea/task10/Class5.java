package ru.mirea.task10;

public class Class5 {
    int S = 0;
    public int Num(int n){
        if(n == 0)
            return S;
        S = S + n % 10;
        return Num(n/10);

    }
    public static void main(String[] args){
        Class5 ob = new Class5();
        System.out.println(ob.Num(12453));
    }
}