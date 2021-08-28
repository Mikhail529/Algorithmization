import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {


        // Task 27. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
        // Объедение их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
        // при этом не используя дополнительный массив.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array N: ");
        int n = scanner.nextInt();

        ArrayList<Integer> arrayList1 = new ArrayList<>(n);

        for (int i=0; i<n; i++) {
            arrayList1.add(10 + ((int) (Math.random() * 90)));
        }
        System.out.println(arrayList1);

        System.out.println("Enter the size of the array M: ");
        int m = scanner.nextInt();

        ArrayList<Integer> arrayList2 = new ArrayList<>(m);

        for (int i=0; i<m; i++) {
            arrayList2.add(10 + ((int) (Math.random() * 90)));
        }
        System.out.println(arrayList2);
        Collections.reverse(arrayList2);

        System.out.println("Enter element numbered K: ");
        int k = scanner.nextInt();

        for (int i=0; i<arrayList2.size(); i++) {
            arrayList1.add(k+1, arrayList2.get(i));
        }
        System.out.println(arrayList1);
    }
}