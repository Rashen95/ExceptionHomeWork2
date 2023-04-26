/**
 * Задание 2 Если необходимо, исправьте данный код
 */

public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 4, 7, 5, 4, 2};
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}
