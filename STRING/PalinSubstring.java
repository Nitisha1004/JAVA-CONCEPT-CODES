package STRING;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PalinSubstring {
    public String preProcess(String str) {
        int len = str.length();
        if (len == 0)
            return "^$";
        String s = "^";
        for (int i = 0; i < len; i++)
            s += "#" + str.charAt(i);
        s += "#$";
        return s;
    }

    public String getLongestPalindrome(String str) {
        char[] s = preProcess(str).toCharArray();
        int N = s.length;
        int[] p = new int[N + 1];
        int id = 0, mx = 0;
        for (int i = 1; i < N - 1; i++) {
            p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 0;
            while (s[i + 1 + p[i]] == s[i - 1 - p[i]])
                p[i]++;
            if (i + p[i] > mx) {
                mx = i + p[i];
                id = i;
            }
        }
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < N - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }
        int pos = (centerIndex - 1 - maxLen) / 2;
        return str.substring(pos, pos + maxLen);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Manacher Algorithm Test\n");
        System.out.println("\nEnter String");
        String text = br.readLine();

        PalinSubstring m = new PalinSubstring();
        String longestPalindrome = m.getLongestPalindrome(text);
        System.out.println("\nLongest Palindrome : " + longestPalindrome);
    }
}