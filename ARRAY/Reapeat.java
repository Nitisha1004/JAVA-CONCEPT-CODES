package ARRAY;

public class Reapeat {
    public static void main(String[] args) {

        int a[] = { 5, 2, 5, 5, 2 };
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println(a[i]);
                break;
            }

        }

    }
}
