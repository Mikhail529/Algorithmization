import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 10. Дан целочисленный массив с количеством элементов N. Сжать массив, выбросив из него
        // каждый второй элемент (освободившиеся элементы заменить нулями).
        // Примечание. Дополнительный массив не использовать.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i=0; i<array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        System.out.println(Arrays.toString(array));

        for (int i=1; i<array.length; i+=2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}