import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 1. В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter value K: ");
        int k = scanner.nextInt();

        int sum = 0;

        for (int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        for (int s : array) {
            if (s % k == 0) {
                sum = sum + s;
            }
        }
        System.out.println("Сумма элементов кратное " + k + " равна: " + sum);
    }
}