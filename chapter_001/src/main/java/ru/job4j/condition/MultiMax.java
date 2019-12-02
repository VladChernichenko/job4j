package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int fs = first - second > 0 ? first : second;
        return third - fs > 0 ? third : fs;
    }
}
