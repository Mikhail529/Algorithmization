public class CLS {
    public static void main(String[] args) {

        // Task 49. Найти все натуральные n-значные числа, цифры в которых обзаруют строго возрастающую
        // последовательность (например 1234, 5678). Для решения задачи использовать декомпозицию

        System.out.println("\n2-х значиные числа\n");
        findMunbers(2);
        System.out.println("\n3-х значиные числа\n");
        findMunbers(3);
        System.out.println("\n4-х значиные числа\n");
        findMunbers(4);
        System.out.println("\n5-х значиные числа\n");
        findMunbers(5);
        System.out.println("\n6-х значиные числа\n");
        findMunbers(6);
        System.out.println("\n7-х значиные числа\n");
        findMunbers(7);
        System.out.println("\n8-х значиные числа\n");
        findMunbers(8);
        System.out.println("\n9-х значиные числа\n");
        findMunbers(9);
    }

    public static void findMunbers (int n) {

        int[] array = new int[] {1,2,3,4,5,6,7,8,9};

        for (int i=0; i< array.length; i++) {
            int k = 0;
            StringBuilder str = new StringBuilder();
            for (int j = i; j < array.length; j++) {
                if (k == n) {
                    continue;
                }
                if (i + (n - 1) == array.length) {
                    break;
                }
                str.append(String.valueOf(array[j]));
                k++;
            }
            if (k < n) {
                break;
            }
            System.out.println(Integer.parseInt(str.toString()));
        }
    }
}