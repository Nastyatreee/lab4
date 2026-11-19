package ru.mirea.lab20;

import java.io.Serializable;

public class LimitedTrio<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {
    private T a;
    private V b;
    private K c;

    public LimitedTrio(T a, V b, K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public V getB() {
        return b;
    }

    public K getC() {
        return c;
    }

    public void showTypes() {
        System.out.println(a.getClass().getSimpleName() + ", "
                + b.getClass().getSimpleName() + ", "
                + c.getClass().getSimpleName());
    }
}
