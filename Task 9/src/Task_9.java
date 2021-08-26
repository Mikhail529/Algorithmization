import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 9. В массиве целых чисел с количеством N найти наиболее часто встречающееся число.
        // Если таких чисел несколько, то определить наименьшее из них

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i=0; i<array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
        }

        System.out.println(Arrays.toString(array));

        int maxCount = 1;
        int nOne = -1;
        for (int i=0; i<n; i++) {
            int count = 0;
            for (int j=i; j < n; j++) {
                if (array[i] == array[j])
                    count++;
                if (maxCount < count) {
                    maxCount = count;
                    nOne = i;
                }
            }
        }
        if (nOne > -1)
            System.out.println(array[nOne]);
        else System.out.println("No repeating elements!");
    }
}