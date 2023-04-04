package ARRAY;

public class Rotateright {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = a.length;
        rotateright(a, n);
    }

    static void rotateright(int a[], int n) {
        int d = 2;
        d = d % n;
        for (int i = 0; i < n; i++) {
            if (i < d) {
                System.out.print(a[n + i - d] + " ");
            } else {
                System.out.print(a[i - d] + " ");
            }
        }

    }

}
