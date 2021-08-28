import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 29. Сортировка выбором.
        // Дана последовательность A1 <= A2 <=...<= An. Требуется переставить элементы так,
        // чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого элемента,
        // выбирается наибольший элемент и ставиться на первое место, а первый на место наибольшего.
        // Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the sequence N: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = 10 + (int) (Math.random() * 90);
        }
        System.out.println("Source array: ");
        System.out.println(Arrays.toString(array));

        for (int j = 0; j < array.length; j++) {
            int max = j;
            for (int i = j; i < array.length; i++) {
                if (array[i] > array[max]) {
                    max = i;
                }
            }
            int tmp = array[j];
            array[j] = array[max];
            array[max] = tmp;
        }
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }
}