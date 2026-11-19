package ru.mirea.lab21;

import java.util.ArrayList;

public class Converter {
    public static <E> void arrayToArrayList(E[] a, ArrayList<E> lst) {
        for (E e : a) {
            lst.add(e);
        }
    }

    public static void main(String[] args) {
        String[] cities = {"Москва", "Казань", "Сочи"};
        ArrayList<String> cityList = new ArrayList<>();
        arrayToArrayList(cities, cityList);
        System.out.println(cityList);

        Double[] marks = {4.5, 3.0, 5.0};
        ArrayList<Double> markList = new ArrayList<>();
        arrayToArrayList(marks, markList);
        System.out.println(markList);
    }
}
