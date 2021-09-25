import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 51. Из заданого числа вычли сумму его цифр. Из результата вновь вычли его сумму и т.д.
        // Сколько таких действий нуда поизвести, чтобы получился ноль?
        // Для решения задачи использовать декомпозицию

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = scanner.nextInt();
        int k = 0;

        someMethod(n, k);
    }

    public static void someMethod (int n, int k) {

        String[] str = String.valueOf(n).split("");

        int[] array = new int[str.length];
        for (int i=0; i<str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        System.out.print(Arrays.toString(array));

        int sum = 0;

        for (int j : array) {
            sum += j; }
        
        System.out.println("  Sum: " + sum);
        n = n - sum;
        k++;

        if (n <= 0) {
            System.out.println("The method was executed " + k + " times. Number n: " + n);
            return; }

        someMethod(n, k);
    }
}