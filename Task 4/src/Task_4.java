import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 4. Даны действительные числа a1,a2,...,an. Поменять местами наибольший и наименьший элементы

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i=0; i<array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }
        System.out.println(Arrays.toString(array));

        int max = 0;
        int min = 0;

        for (int i=0; i<array.length; i++) {
            if (array[max] < array[i])
                max = i;
            if (array[min] > array[i])
                min = i;
        }
        System.out.println("Max: " + array[max] + ", Min: " + array[min]);

        int swap = array[max];
        array[max] = array[min];
        array[min] = swap;

        System.out.println(Arrays.toString(array));
    }
}