package ru.mirea.task1;
import java.util.Scanner;
public class Factorial {
    public int s;
    Scanner a = new Scanner(System.in);
    int n = a.nextInt();
    public void Fact(){
        s = n;
        while (n>1){
            s = s*(n-1);
            n--;
        }
        System.out.println(s);
    }
    public static void main(String[] args){
        Factorial ob1 = new Factorial();
        ob1.Fact();

    }
}