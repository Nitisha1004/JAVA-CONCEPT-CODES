package ARRAY;

import java.util.Scanner;

public class Twodimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(+r + "x" + c);
        int[][] A = new int[r][c];
        System.out.println("Enter elements of Array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(A[i][j]);

            }
        }
        System.out.println("Enter element to be search");
        int search = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                if (A[i][j] == search) {
                    System.out.println("Element found at index:" + i + " , " + j);
                }

        }
    }
}
