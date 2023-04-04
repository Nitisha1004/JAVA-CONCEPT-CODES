package ARRAY;

public class Subaaray {
    public static void main(String[] args) {
        int[] a = { 2, 4, 6, 8 };
        Subarray(a);
    }

    static void Subarray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
