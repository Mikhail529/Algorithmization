import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 32. Сортировка Шелла.
        // Дан массив n действительных чисел. Требуется упорядочит его по возрастанию.
        // Делается это следующим образом: сравниваются два соседних элемента Ai и Ai+1.
        // Если Ai <= Ai+1, то продвигатся на один элемент вперед. Если Ai > Ai+1,
        // то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the sequence N: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            int positiveNegative = Math.random() < 0.5 ? -1 : 1;
            array[i] = (int) (Math.random() * 100) * positiveNegative;
            System.out.print(array[i] + ", ");
        }

        System.out.println("\nResult after sorting: ");
        sorting(array);
    }

    private static void sorting(int[] array){
        int temp;
        int i = 1;
        while (i < array.length) {
            if (array[i - 1] > array[i]) {
                temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                if (i - 1 > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        for (int value : array) {
            System.out.print(value + ", ");
        }
    }
}