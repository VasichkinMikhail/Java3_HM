package ru.geekbrains.java3.hw;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Integer[] integers = new Integer[2];

        integers[0] = 1;
        integers[1] = 2;

        System.out.println(Arrays.deepToString(integers));
        swap(integers,0,1);
        System.out.println(Arrays.deepToString(integers));

        ArrayList<Integer> arrayList = toArrayList(integers); // Преобразование массива в ArrayList
        System.out.println(arrayList);
    }
    private static void swap(Object[] objects, int i1, int i2) { // Метод который меняет местами элементы
        Object obj = objects[i1];
        objects[i1] = objects[i2];
        objects[i2] = obj;
    }

    public static <T>ArrayList<T> toArrayList(T[] arr){ //Метод преобразования массива в ArrayList
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
