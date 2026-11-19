package ru.mirea.lab20;

public class MinMax<T extends Comparable<T>> {
    private T[] items;

    public MinMax(T[] items) {
        this.items = items;
    }

    public T getMin() {
        T min = items[0];
        for (T item : items) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }

    public T getMax() {
        T max = items[0];
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
