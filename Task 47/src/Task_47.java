import java.util.Scanner;
import java.util.stream.IntStream;

public class CLS {
    public static void main(String[] args) {

        // Task 47. Два простых числа называются "близнецами", если они отличаются друг от друга на 2
        // (например 41 и 43). Найти и напечатать все пары "близнецов" на отрезке [n, 2n],
        // где n-заданое натуральное число больше 2. Для решения задачи использовать декомпозицию

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number greater than two: ");
        int n = scanner.nextInt();

        testElements(n);

        System.out.println("Enter the second number: ");
        int n2 = scanner.nextInt();

        pairPrint(n, n2);
    }
    
    public static void testElements(int n) {
        Scanner scanner = new Scanner(System.in);
        while (!(n >= 2 )) {
            System.out.println("Please enter a number greater than two: ");
            n = scanner.nextInt();
        }
    }

    public static boolean isPrime(final int number) {
        return IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }

    public static void pairPrint(int n, int n2) {
        int numberPair = 0;
        for (int i=n; i<n2; i++) {
            if (!(isPrime(i))) {
                if ( !(isPrime(i+2))) {
                    numberPair++;
                    System.out.print("Pair is " + numberPair + ": " + i + " and " + (i+2) + "\n");
                }
            }
        }
    }
}