package ru.mirea.lab20;

public class Calculator {
    public static <A extends Number, B extends Number> double sum(A x, B y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <A extends Number, B extends Number> double multiply(A x, B y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <A extends Number, B extends Number> double divide(A x, B y) {
        if (y.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return x.doubleValue() / y.doubleValue();
    }

    public static <A extends Number, B extends Number> double subtraction(A x, B y) {
        return x.doubleValue() - y.doubleValue();
    }
}
