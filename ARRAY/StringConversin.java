package ARRAY;

import java.util.*;

public class StringConversin {
   public static void main(String[] args) {
      // conversion from number to string
      int num = 123;
      String str = Integer.toString(num);
      System.out.println(num);

      // conversion from string to number
      String string = "123";
      int number = Integer.parseInt(string);
      System.out.println(number);

      // equal check
      String s = "Nitisha";
      String s1 = "Nitisha";
      if (s.equals(s1)) {
         System.out.println("Strings are equal");

      } else {
         System.out.println("Strings are not equal");
      }

      // concatenation
      String r = "I am";
      String p = "happy";
      System.out.println(r + " " + p);

      // charAT
      for (int i = 0; i < r.length(); i++) {
         System.out.println(p.charAt(i));
      }
      // using ==
      String a = "IamNitt";
      String b = "Iam";
      if (a == b) {
         System.out.println("Equal");
      } else {
         System.out.println("Not equal");
      }
      // declaring string under if condition
      if (new String("tonyy") == new String("tonyy")) {
         System.out.println("Equal");
      } else {
         System.out.println("Not equal");
      }

      // finding substring
      String new1 = "I am moody";
      String parent = new1.substring(2, 7);

      System.out.println(parent);

   }
}
