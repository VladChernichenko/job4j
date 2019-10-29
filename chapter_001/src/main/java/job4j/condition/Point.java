package condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result1 = distance(0, 0, 3, 4);
        double result2 = distance(0, 0, 300, 400);
        System.out.println("result (0, 0) to (3, 4) " + result1);
        System.out.println("result (0, 0) to (300, 400) " + result2);
    }
}
