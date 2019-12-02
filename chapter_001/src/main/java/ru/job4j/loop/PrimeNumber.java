package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int x) {
        int count = 1;
        for (int i = 2; i <= x; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++;
            }
        }
        return count;
    }
}
