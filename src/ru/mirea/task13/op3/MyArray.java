package ru.mirea.task13.opt3;
import java.util.Arrays;
public class MyArray<T> {
    private int size;
    private T[] array;
    private final int DEFAULT_CAPACITY = 10;

    public MyArray(int capacity){
        if(capacity <= 0)
            throw new IllegalArgumentException("Capacity <= 0");
        else
            array = (T[]) new Object[capacity];
    }
    public MyArray(){
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }
    public void add(T m){
        array[size++] = m;
    }
    public void add(int index, T m){
        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = m;
        size++;
    }
    public void delete(int index){
        for (int i = index; i < size; i++) {
            array[i] = array[i+1];
        }
    }
    public void delete(T m){
        int position = index(m);
        if(position < 0)
            return;
        delete(position);
    }
    public void display(){
        for(T elem: array){
            System.out.print(elem + " ");
        }
    }
    private int index(T m){
        if(m == null)
            return -1;
        for (int i = 0; i < size; i++) {
            if(m.equals(array[i]))
                return i;
        }
        return -1;
    }
    public T get(int index){
        if(index < 0 || index > size)
        {
            System.out.println("the index is wrong");
            return null;
        }
        return array[index];
    }
    public void set(int index, T m){
        if(index < 0 || index > size)
        {
            System.out.println("the index is wrong");
            return;
        }
        array[index] = m;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){
        return Arrays.toString(Arrays.copyOf(array, size));
    }
}