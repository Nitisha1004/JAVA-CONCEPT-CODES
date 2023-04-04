package ARRAY;

public class Find {

    public static void main(String[] args) {
        int arr[] = { 11, 12, 14, 15 };
        int n = arr.length + 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int p = (n * (n + 1)) / 2;
        int q = p - sum;
        System.out.println(q);
    }
}
