package ARRAY;

import java.util.*;

public class CountTripplets {
    public static void countTriplet(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            int l = 0;
            int h = i - 1;
            int sum = 0;
            while (l < h) {
                sum = arr[l] + arr[h];
                if (sum == arr[i]) {
                    l++;
                    h--;
                    count++;
                } else if (sum < arr[i]) {
                    l++;
                } else {
                    h--;
                }
            }
        }
        System.out.println(count);
        ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countTriplet(arr, n);

    }
}
