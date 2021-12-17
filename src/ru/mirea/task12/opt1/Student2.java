package ru.mirea.task12.opt1;

import java.util.Scanner;

public class Student2 {
    public static void main(String [] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int IdNumber[] = new int[n];
        String Student[] = new String[n];
        for(int i = 0; i < Student.length; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Student"+i+":");
            Student[i] = scanner1.nextLine();
        }
        for(int i = 0; i < Student.length; i++){
            Scanner scanner2 = new Scanner(System.in);
            System.out.print(Student[i]+"_Id: ");
            IdNumber[i] = scanner2.nextInt();
        }
        for(int i = 1; i < IdNumber.length; i++){
            int a = IdNumber[i];
            String b = Student[i];
            int j = i;
            while (j > 0 && IdNumber[j - 1] > a){
                IdNumber[j] = IdNumber[j - 1];
                Student[j] = Student[j-1];
                j--;
            }
            IdNumber[j] = a;
            Student[j] = b;
        }
        for(int i = 0; i < IdNumber.length; i++){
            System.out.println(Student[i]+"_Id: "+IdNumber[i]);
        }

    }
}
