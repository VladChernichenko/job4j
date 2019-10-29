package converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    private static boolean testRubleToEuro(int in, int expected) {
        int out = rubleToEuro(in);
        return expected == out;

    }
    private static boolean testRubleToDollar(int in, int expected) {
        int out = rubleToDollar(in);
        return expected == out;
    }
    private static boolean testEuroToRuble(int in, int expected){
        int out = euroToRuble(in);
        return expected == out;
    }
    private static boolean testDollarToRuble(int in, int expected){
        int out = dollarToRuble(in);
        return expected == out;
    }

    public static void main(String[] args) {

        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(1000);
        int ruble = euroToRuble(1000);
        int rubleFromDollar = dollarToRuble(1000);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("1000 rubles are " + dollar + " dollars.");
        System.out.println("1000 euro are " + ruble + " rubles.");
        System.out.println("1000 dollars are " + rubleFromDollar + " rubles.");

        //run tests:
        System.out.println("140 rubles are 2 euro. Test result : " + testRubleToEuro(140, 2));
        System.out.println("120 rubles are 2 dollars. Test result : " + testRubleToDollar(120, 2));
        System.out.println("2 euro are 140 rubles. Test result : " + testEuroToRuble(2, 140));
        System.out.println("2 dollars are 120 rubles. Test result : " + testDollarToRuble(2, 120));


    }
}
