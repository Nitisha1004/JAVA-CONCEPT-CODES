package ARRAY;

import java.util.*;

class Shift {
    public static void main(String[] args) {
        int[] num = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        sortColors(num);
    }

    public static void sortColors(int[] num) {
        int l = 0;
        int h = num.length - 1;
        int m = 0;
        int temp;
        while (m <= h) {
            switch (num[m]) {
                case 0: {
                    temp = num[l];
                    num[l] = num[m];
                    num[m] = temp;
                    l++;
                    m++;
                    break;
                }
                case 1: {
                    m++;
                    break;
                }
                case 2: {
                    temp = num[m];
                    num[m] = num[h];
                    num[h] = temp;
                    h--;
                    break;
                }

            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}