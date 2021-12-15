package ru.mirea.task1;
public class HormonicNumber {
    public static void main(String[] args){
        for(int i = 1; i<11; i++){
            float n = (float)(1.0/i);
            System.out.print(String.format(" %f", n));
        }
    }
}