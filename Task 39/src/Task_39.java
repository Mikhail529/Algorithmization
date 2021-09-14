import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 39. Составить программу, которая в массиве A[N] находит второе по величине число
        // (вывести на печать число, которое меньше максимального элемента, но больше всех других элементов)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        sortArray(array);

        System.out.println("Last element: " + array[n - 2]);
    }

    public static void sortArray(int[] array) {
        for (int i=-0; i<array.length; i++) {
            array[i] = (int) ((Math.random() * 90) + 10);
        }

        for (int min = 0; min < array.length-1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }
    }
}