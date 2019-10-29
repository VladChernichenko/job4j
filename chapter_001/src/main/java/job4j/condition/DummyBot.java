package job4j.condition;

import java.util.Scanner;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if("Пока".equals(question)){
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте вопрос");
        String question = scanner.nextLine();
        System.out.println(answer(question));
        scanner.close();
    }
}
