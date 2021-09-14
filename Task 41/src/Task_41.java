public class CLS {
    public static void main(String[] args) {

        // Task 41. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

        Factor();
        
    }

    public static void Factor() {

        int sumFactor = 0;
        int fact = 1;
        for (int i=0; i<10; i++) {
            if (i%2 != 0) {
                for (int j=1; j<=i; j++) {
                    fact = fact * j;
                }
                // System.out.println("Факториал числа: " + "!" + i + " равен = " + fact);
                sumFactor += fact;
                fact = 1;
            }
        }

        System.out.println("Sum of factorials: " + sumFactor);
    }
}