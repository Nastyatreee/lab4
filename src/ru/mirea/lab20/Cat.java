package ru.mirea.lab20;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    public Cat(String nickname) {
        super(nickname);
    }
}
