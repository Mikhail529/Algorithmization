import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 28. Даны две последовательности A1 <= A2 <=...<= An и B1 <= B2 <=...<= Bn..
        // Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
        // Примечание. Дополнительный массив не использовать

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the first sequence A: ");
        int a = scanner.nextInt();

        ArrayList<Integer> arrayList_A = new ArrayList<>(a);

        for (int i=0; i<a; i++) {
            arrayList_A.add(10 + ((int) (Math.random() * 90)));
        }

        Collections.sort(arrayList_A);

        System.out.println("Enter the size of the second sequence B: ");
        int b = scanner.nextInt();

        ArrayList<Integer> arrayList_B = new ArrayList<>(b);

        for (int i=0; i<b; i++) {
            arrayList_B.add(10 + ((int) (Math.random() * 90)));
        }

        Collections.sort(arrayList_B);

        System.out.println("ArrayList A: " + arrayList_A);
        System.out.println("ArrayList B: " + arrayList_B);

        arrayList_A.addAll(arrayList_B);

        Collections.sort(arrayList_A);
        System.out.println("ArrayList A+B: " + arrayList_A);
    }
}