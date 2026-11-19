package ru.mirea.lab21;

public class StorageTest {
    public static void main(String[] args) {
        Storage<Integer> ints = new Storage<>(new Integer[]{5, 10, 15});
        Storage<Long> longs = new Storage<>(new Long[]{3000000000L, 4000000000L});
        Storage<Character> chars = new Storage<>(new Character[]{'x', 'y', 'z'});

        System.out.println("ints[2] = " + ints.getElement(2));
        System.out.println("longs[1] = " + longs.getElement(1));
        System.out.println("chars[0] = " + chars.getElement(0));

        try {
            ints.getElement(7);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
