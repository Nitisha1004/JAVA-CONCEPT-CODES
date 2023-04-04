package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int[] input3 = new int[input1];
        for (int i = 0; i < input1; i++) {
            input3[i] = sc.nextInt();
        }
        int sum = 0;
        Arrays.sort(input3);
        for (int i = 0; i < input1; i++) {
            System.out.println(input3[i]);
        }
        for (int i = input3.length - 1; i >= input2; i--) {
            sum = sum + input3[i];
        }
        System.out.println(sum);
    }
}
