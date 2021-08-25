import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 2. Дана последовательность действительных чисел a1,a2,...,an.
        // Заменить все её члены, больше данного Z, этим числом. Посчитать количество замен

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter value Z: ");
        int z = scanner.nextInt();
        int k = 0;

        for (int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        for (int i=0; i<array.length; i++) {
            if (array[i] >= z) {
                array[i] = z;
                ++k;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Number of replacements: " + k);
    }
}