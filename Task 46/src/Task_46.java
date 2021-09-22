import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 46. Даны натуральные числа K и N. Написать метод(методы) формирования массива A, элементами
        // которого являются числа, сумма цифр которых равна K и которое не больше N

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number K: ");
        int k = scanner.nextInt();
        System.out.println("Enter the number N: ");
        int n = scanner.nextInt();

        int[] array = new int[k];

        randomArray(array, k, n);

        printArray(array);
    }

    // Заполнение массива числами
    public static void randomArray (int[] array, int k, int n) {
        for (int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random() * n);
            while ( !(k == sumElementsArray(array[i])) ) {
                array[i] = (int) (Math.random() * n);
            }
        }
    }

    // Вывод массива на печать
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Сумма цифр числа
    public static int sumElementsArray (int x) {
        String[] arrayStr = String.valueOf(x).split("");
        int sum = 0;

        for (String i : arrayStr) {
            int temp = Integer.parseInt(i);
            sum += temp;
            temp = 0;
        }
        return sum;
    }
}