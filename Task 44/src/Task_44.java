import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 44. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами
        // которого цифра числа N

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = scanner.nextInt();

        func(n);
    }

    public static void func (int n) {
        String[] arrayStr = String.valueOf(n).split("");
        System.out.println("Array of number n: " + Arrays.toString(arrayStr));
    }
}