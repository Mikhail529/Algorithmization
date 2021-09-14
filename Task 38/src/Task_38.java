import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 38. На плоскасти заданы своими координатами n точек.
        // Написать метод, определяющие, между какими из пар точек самое большое расстояние.
        // Указание. Координаты точек занести в массив

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of pairs: ");
        int n = scanner.nextInt();

        int[] a = new int[n]; // x1
        int[] b = new int[n]; // y1
        int[] c = new int[n]; // x2
        int[] d = new int[n]; // y2

        arrayRamdomNumbers(a, n);
        arrayRamdomNumbers(b, n);
        arrayRamdomNumbers(c, n);
        arrayRamdomNumbers(d, n);

        distance(a, b, c, d, n);
    }

    public static void distance(int[] a, int[] b, int[] c, int[] d, int n) {
        int a1 = 0, b1 = 0, c1 = 0, d1 = 0;

        double distMax = 0;
        for (int i=0; i<n; i++) {
            double dist = Math.sqrt( Math.pow((c[i]-a[i]), 2) + Math.pow((d[i]-b[i]), 2));

            System.out.println("Couple number is: " + (i+1) );
            System.out.println("(" + a[i] + ";" + b[i] + ")" + " и " + "(" +c[i] + ";" + d[i] + ")");
            System.out.println("Distance: " + dist + "\n");
            if (distMax < dist) {
                distMax = dist;
                a1 = a[i];
                b1 = b[i];
                c1 = c[i];
                d1 = d[i];
            }
        }
        String s = String.valueOf(distMax);
        distMax = Double.parseDouble(s.substring(0, s.indexOf(".") +3));

        System.out.println("The maximum distance: " + distMax);
        System.out.println("The maximum length belongs to the pair: " + "(" + a1 + ";" + b1 + ")" + " и "
                + "(" + c1 + ";" + d1 + ")");
    }

    public static void arrayRamdomNumbers(int[] array, int n) {
        for (int i=0; i<n; i++) {
            array[i] = ((int) (Math.random() * 10) - 10);
        }
    }
}