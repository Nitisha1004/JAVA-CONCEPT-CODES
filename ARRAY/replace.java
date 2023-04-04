package ARRAY;

import java.util.Scanner;

public class replace {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string from the user:");
    String alpha = sc.next();
    String replace = "";
    for (int i = 0; i < alpha.length(); i++) {
      if (alpha.charAt(i) == 'e') {
        replace += 'i';
      } else {
        replace += alpha.charAt(i);
      }
    }
    System.out.println(replace);
  }
}
