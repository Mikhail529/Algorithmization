import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 5. Даны целые числа a1,a2,...,an. Вывести на печать только те числа, для которых ai > i.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i=0; i<array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }
        System.out.println(Arrays.toString(array));

        for (int j : array) {
            if (j > array.length)
                System.out.println(j);
        }
    }
}