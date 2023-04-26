import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task4 {
    public static void main(String[] args) throws StringIsEmptyException {
        System.out.println("Введите что нибудь:");
        Scanner s = new Scanner(System.in);
        String userInput = s.nextLine().replaceAll(" ", "");
        if (userInput.isEmpty()) {
            throw new StringIsEmptyException("Вы ввели пустую строку");
        } else {
            System.out.println("Молодец");
        }
    }
}

class StringIsEmptyException extends Exception {
    public StringIsEmptyException(String message) {
        super(message);
    }
}