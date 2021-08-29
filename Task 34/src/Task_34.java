public class CLS {
    public static void main(String[] args) {

        // Task 34. Даны дроби.
        // Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает
        // их в порядке возрастания

        CML [] array = {new CML(1, 5), new CML(4, 8),
                new CML(5, 11), new CML(11, 17),
                new CML(4, 15), new CML(8, 15),
                new CML(2, 10), new CML(7, 21)};

        setX(array);
        sort(array);
        for (CML element : array) {
            System.out.print(element + ", ");
        }
        System.out.print("\b\b");
    }

    private static void setX (CML [] array) {
        boolean isCommon = false;
        int commonDenominator = 0;
        while (!isCommon) {
            isCommon = true;
            commonDenominator++;
            for (CML element : array) {
                if (commonDenominator % element.denom != 0) {
                    isCommon = false;
                    break;
                }
            }
        }

        for (CML element : array) {
            element.numer *= (double) commonDenominator / element.denom;
            element.denom = commonDenominator;
        }
    }

    private static void sort (CML [] array) {
        for (int i = array.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].numer > array[j + 1].numer) {
                    CML temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static class CML {
        int numer;
        int denom;
        CML(int numer, int denom) {
            this.numer = numer;
            this.denom = denom;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", numer, denom);
        }
    }
}