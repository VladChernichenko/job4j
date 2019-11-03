package job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
       int fs = first - second > 0 ? first : second;
       int fst = third - fs > 0 ? third : fs;
       return forth - fst > 0 ? forth : fst;
    }
}