package job4j.array;

import java.util.Arrays;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            String s = Arrays.toString(array);
            if (array[index] == null) {
                int k = index;
                while (k < array.length - 1){
                    array[k] = array[k + 1];
                    array[k + 1] = null;
                    k++;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};

        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}