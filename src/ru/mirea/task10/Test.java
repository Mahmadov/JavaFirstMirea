package ru.mirea.task10;
public class Test {
    static int Sum(int k, int s){
        int a = (int) Math.pow(10,k-1);
        int b = (int) Math.pow(10, k);
        int S = 0, t = 0, p = 0;
        while(a < b){
            int c = a;
            while(c>0){
                p = c % 10;
                S = S + p;
                c = c/10;
            }
            if(S == s){
                System.out.println(a);
                t++;
                a = a+9;
            }
            else if(S != s)
                a++;
            if(p>s)
                a = b;

            S = 0;
        }
        System.out.println("t = "+t);
        return 0;
    }
    public static void main(String[] args){
        Sum(5,3);
    }

}