import java.util.Scanner;

/**
 * Задание 1Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.printf("Вы ввели: %s\n", converter());
    }

    public static float converter() {
        boolean flag = false;
        String userInput = null;
        while (!flag) {
            System.out.println("Введите дробное число типа float:");
            Scanner s = new Scanner(System.in);
            userInput = s.nextLine().replaceAll(" ", "").replaceAll(",", ".");
            if (isFloat(userInput)) {
                flag = true;
            } else {
                System.out.println("Вы ввели неверное значение");
            }
        }
        return Float.parseFloat(userInput);
    }

    public static boolean isFloat(String s) {
        try {
            Float.parseFloat(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}