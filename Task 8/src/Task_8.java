import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {
        
        // Task 8. Дана последовательность целых чисел a1,a2,...,an. Образовать новую последовательность,
        // выбросив из исходной те члены, которые равны min(a1,a2,...,an.)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }
        System.out.println(Arrays.toString(array));

        if (array.length == 0) {
            throw new IllegalArgumentException("Массив нулевой длины!");
        }

        int minCount = 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];

            }
        }

        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }

        int[] result = new int[array.length - minCount];

        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}