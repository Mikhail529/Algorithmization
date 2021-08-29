import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 36. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[4];
        for (int i=0; i<array.length; i++) {
            System.out.println("Enter number " + (i+1));
            array[i] = scanner.nextInt();
        }
        System.out.println(findGCD(array, 4));
    }

    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static int findGCD(int arr[], int n)
    {
        int result = 0;
        for (int element: arr){
            result = gcd(result, element);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }
}