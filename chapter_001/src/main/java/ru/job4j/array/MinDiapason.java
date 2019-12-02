package ru.job4j.array;

//the main reason this commit was added is to separate it from previous fixed problem. Although the task 6.5.2 was already done.
public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
