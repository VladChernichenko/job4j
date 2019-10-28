package ru.job4j.converter.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = (p * k) / (2 * (k + 1));
        System.out.println("h = " + h);
        System.out.println("l = " + l);
        return h * l;
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, real = " + result1);
    }
}
