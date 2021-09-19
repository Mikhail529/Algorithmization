import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 42. Задан массив D. Определить следующие суммы D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6].
        // Пояснение. Составить метод(методы) для вычисления суммы последовательнорасположенных элементов
        // массива с номерами от k до m

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array size: ");
        int n = scanner.nextInt();

        int[] arrayD = new int[n];

        fillRandom(arrayD);

        System.out.println("Starting point K: ");
        int k = scanner.nextInt();

        testK(k, arrayD);

        System.out.println("End point M: ");
        int m = scanner.nextInt();

        testM(k, m, arrayD);

        System.out.println("Sum of elements from " + k + " to " + m + ": " + summa(k, m, arrayD));
    }

    public static void fillRandom (int[] arrayD) {
        for (int i=0; i<arrayD.length; i++) {
            arrayD[i] = (int) (Math.random() * 90 + 10);
        }
    }

    public static void testK (int k, int[] arrayD) {
        Scanner scanner = new Scanner(System.in);
        while (k < 0) {
            System.out.println("Error: K number less than zero!");
            System.out.println("Starting point K: ");
            k = scanner.nextInt();
        }
        while (k > arrayD.length) {
            System.out.println("Error: Number K is larger than the size of the array!");
            System.out.println("Starting point K: ");
            k = scanner.nextInt();
        }
    }

    public static void testM (int k, int m, int[] arrayD) {
        Scanner scanner = new Scanner(System.in);
        while (m < 0) {
            System.out.println("Error: M number less than zero!");
            System.out.println("Starting point M: ");
            m = scanner.nextInt();
        }
        while (m > arrayD.length) {
            System.out.println("Error: Number M is larger than the size of the array!");
            System.out.println("Starting point M: ");
            m = scanner.nextInt();
        }
        while (m <= k) {
            System.out.println("Error: The M number is less than the K number!");
            System.out.println("Starting point M: ");
            m = scanner.nextInt();
        }
    }
    
    public static int summa (int k, int m, int[] arrayD) {
        int sum = 0;

        for (int i=0; i < arrayD.length; i++) {
            if (i >= k && i <= m) {
                sum+=arrayD[i];
            }
        }
        return sum;
    }
}