package ARRAY;

public class Merge {
    public static void main(String[] args) {
        int[] a1 = { 1, 3, 5, 7 };
        int[] b1 = { 0, 2, 6, 8, 9 };
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < b1.length - 1; j++) {
                if (a1[i] > b1[j]) {
                    int temp = a1[i];
                    a1[i] = b1[j];
                    b1[j] = temp;

                }
                if (b1[j] > b1[j + 1]) {
                    int temp = b1[j];
                    b1[j] = b1[j + 1];
                    b1[j + 1] = temp;

                }
            }
        }
        System.out.println("printing after merge sorted array1:");
        for (int p = 0; p < a1.length - 1; p++) {

            System.out.print(a1[p] + " ");

        }
        System.out.println();

        System.out.println("printing after merge sorted array2");
        for (int q = 0; q < b1.length; q++) {

            System.out.print(b1[q] + " ");

        }

    }
}
