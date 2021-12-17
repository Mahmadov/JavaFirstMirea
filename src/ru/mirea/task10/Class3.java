package ru.mirea.task10;

public class Class3 {
    static int rec(int a, int b)
    {
        if(a == b)
            System.out.println(a);
        if(a<b){
            System.out.println(a);
            rec(a+1, b);

        }
        if(a>b){
            System.out.println(a);
            rec(a-1,b);

        }
        return 0;
    }
    public static void main(String[] args){
        rec(6, 1);
    }

}