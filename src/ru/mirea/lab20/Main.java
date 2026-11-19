package ru.mirea.lab20;

public class Main {
    public static void main(String[] args) {
        Trio<Character, String, Boolean> trio = new Trio<>('Н', "Настя", true);
        System.out.println("Trio: " + trio.getA() + ", " + trio.getB() + ", " + trio.getC());
        trio.showTypes();

        LimitedTrio<Double, Cat, Long> limited = new LimitedTrio<>(4.8, new Cat("Мурка"), 22L);
        System.out.println("LimitedTrio: " + limited.getA() + ", " + limited.getB().getNickname() + ", " + limited.getC());
        limited.showTypes();

        Double[] prices = {45.5, 12.0, 99.9, 30.1};
        MinMax<Double> mm = new MinMax<>(prices);
        System.out.println("Минимум: " + mm.getMin() + ", максимум: " + mm.getMax());

        Character[] letters = {'к', 'а', 'я'};
        MinMax<Character> ml = new MinMax<>(letters);
        System.out.println("Минимум: " + ml.getMin() + ", максимум: " + ml.getMax());

        System.out.println("sum(3, 1.5) = " + Calculator.sum(3, 1.5));
        System.out.println("multiply(4L, 2.5f) = " + Calculator.multiply(4L, 2.5f));
        System.out.println("divide(9, 2) = " + Calculator.divide(9, 2));
        System.out.println("subtraction(10.5, 3) = " + Calculator.subtraction(10.5, 3));
        try {
            Calculator.divide(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("divide(5, 0): " + e.getMessage());
        }
    }
}
