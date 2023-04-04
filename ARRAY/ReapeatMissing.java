package ARRAY;

import java.util.*;

public class ReapeatMissing {
    public static void main(String[] args) {

        int Sumofall;
        int a[] = { 2, 3, 4, 5, 6 };
        int n = a.length;
        // System.out.println(Arrays.toString(a));
        Sumofall = (n * (n + 1)) / 2;
        for (int i = 0; i < n - 1; i++) {
            Sumofall = Sumofall - a[i];
        }
        System.out.println("missing number is:" + Sumofall);
    }
}
