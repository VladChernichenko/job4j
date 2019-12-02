package ru.job4j.calculator;

/**
 * Class Calculator решение задачи части 001 урок 1
 *
 * @author Vlad Chernichenko
 * @since 30.10.2019
 */
public class Calculator {
    /**
     * Сложение
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Вычитание
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Умножение
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Вычитание
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Основной метод, точка входа в приложение
     *
     * @param args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
