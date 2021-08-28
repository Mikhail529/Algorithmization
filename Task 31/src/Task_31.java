import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 31. Сортировка вставками.
        // Дана последовательность чисел. Требуется переставить числа в порядке возрастания.
        // Делается это следующим образом. Пусть - упорядоченая последовательность, т.е.
        // A1 <= A2 <=...<= An. Берётся следующее число Ai+1 и вставляется в последовательность так,
        // чтобы новая последовательность была тоже возрастающей. Процесс роизводится до тех пор,
        // пока все элементы от i+1 до n не будут перебраны. Примечание. Место помещения очередного
        // элемента в отсортированную часть производить с помощью двоичного поиска. Дваичный поиск
        // в виде отдельной функции.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the sequence N: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = 10 + (int) (Math.random() * 90);
        }

        System.out.println("Array before sorting: ");
        for (int value : array) {
            System.out.print(value + ", ");
        }

        sorting(array);

        System.out.println("\nArray after sorting: ");
        for (int value : array) {
            System.out.print(value + ", ");
        }
    }

    private static void sorting (int[] array) {
        int temp;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                int j = binarySearch(array, i, array[i + 1]);
                for (int k = i + 1; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[j] = temp;
            }
        }
    }

    private static int binarySearch (int[] array, int lastIndex, int element) {
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }
}