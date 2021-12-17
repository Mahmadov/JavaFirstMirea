package ru.mirea.task12.opt2;

import ru.mirea.task12.opt2.Comparator;
import ru.mirea.task12.opt2.QuickSort;

public class TestQuickSort {
    public static void main(String[] args) {
        Comparator comparator = new QuickSort();
        QuickSort obj = (QuickSort)comparator;
        obj.init();
        obj.print();
        obj.quickSort(0, obj.getSize() - 1);
        System.out.println();
        obj.print();
    }
}