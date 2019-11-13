package job4j.area;

import java.util.Arrays;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        int[] horArrayWin = new int[5];
        int[] vertArrayWin = new int[5];
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                if ('X' == sign) {
                    horArrayWin[cell] = row;
                    vertArrayWin[row] = cell;
                }
            }
        }
        return checkArray(horArrayWin) || checkArray(vertArrayWin);
    }

    private static boolean checkArray(int[] i) {
        boolean result = false;
            for (int k : i) {
                result = k == i[0];
                if (!result) break;
            }
        return result;
    }
}
