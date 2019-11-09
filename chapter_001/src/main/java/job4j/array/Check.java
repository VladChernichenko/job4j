package job4j.array;

public class Check {
    public boolean mono(boolean[] data) {

        boolean result = false;
        for (boolean b : data) {
            result = data[0] == b;
            if(!result) break;
        }
        return result;
    }
}
