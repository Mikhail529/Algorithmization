import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 30. Сортировка обменами.
        // Дана последовательность чисел A1 <= A2 <=...<= An. Требуется переставить числа в порядке возрастания.
        // Для этого сравниваются два соседних числа Ai и Ai+1. Если Ai>Ai+1, то делаеться перестановка.
        // Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
        // Сортавит алгоритм сортировки, подсчитывая при этом количества перестановок

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the sequence N: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = 10 + (int) (Math.random() * 90);
        }
        System.out.println(Arrays.toString(array));

        boolean sort;
        int temp;

        for (int j = 0; j < n; j++) {
            sort = false;
            while (!sort) {
                sort = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        sort = false;
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}