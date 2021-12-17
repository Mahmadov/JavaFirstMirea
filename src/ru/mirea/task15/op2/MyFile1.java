package ru.mirea.task15.op2;

import java.io.*;

public class MyFile1 {
    public static void main(String[] args){

        try{
            String line;
            File file = new File("HelloMirea.txt");
            if(!file.exists())
                file.createNewFile();
            PrintWriter fw = new PrintWriter(file);
            fw.println("zzzz");
            fw.println("hello world");
            fw.close();
            BufferedReader br;
            br = new BufferedReader(new FileReader("HelloMirea.txt"));
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e){
            System.out.println("error: "+ e);
        }
    }
}