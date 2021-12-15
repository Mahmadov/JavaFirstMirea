package ru.mirea.task1;
public class Array {
    public int i = 0;
    public double s = 0;
    public int[] arr = new int[]{10, 12, 13, 132, 45};
    public void A() {
        do {
            s += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println(s);
    }
    public void B(){
        while(i < arr.length){
            s += arr[i];
            i++;
        }
        s = s/5;
        System.out.println(s);

    }
    public void C(){
        for(int i = 0; i<5; i++){
            s += arr[i];
        }
        System.out.println(s);
    }
    public static void main(String [] args){
        Array d1 = new Array();
        d1.B();
    }

}