package com.tahar.interview.problems;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "dcba";
        boolean result = isPermutable(str1,str2);

        System.out.println("Result" + result);



    }

      private static boolean isPermutable(String str1, String str2) {
        String sortedStr1 = str1.chars()
                        .sorted()
                        .collect(StringBuilder::new,StringBuilder::appendCodePoint,
                                StringBuilder::append).toString();
          String sortedStr2 = str2.chars()
                  .sorted()
                  .collect(StringBuilder::new,StringBuilder::appendCodePoint,
                          StringBuilder::append).toString();


        return sortedStr1.equalsIgnoreCase(sortedStr2);
    }


}
