package ARRAY;

public class MaxsumArray {
    public static void main(String[] args) {
        int[] num = { 1, -3, 4, 2, 1 };
        // MaxsubArray(num);
        System.out.println(MaxsubArray(num));

    }

    static int MaxsubArray(int[] num) {
        int sum = 0;
        int max = num[0];

        // Additon of array elements
        for (int i = 0; i < num.length; i++) {
            sum += num[i];

            if (sum > max)
                max = sum;

            if (sum < 0)
                sum = 0;
        }
        return max;
    }

}
