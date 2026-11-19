package ru.mirea.lab21;

public class Storage<T> {
    private T[] data;

    public Storage(T[] data) {
        this.data = data;
    }

    public T getElement(int index) {
        if (index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException("Индекс " + index + ", размер " + data.length);
        }
        return data[index];
    }

    public int length() {
        return data.length;
    }
}
