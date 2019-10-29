package job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left < right || left == right;
        int result = condition ? right : left;
        return result;
    }
}
