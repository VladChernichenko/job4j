package ru.job4j.converter;

public class Multiple {
    public static final int ONE = 1;

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.println(ONE + " * " + i + " = " + ONE * i);
        }
    }
}
