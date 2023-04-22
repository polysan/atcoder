package atcoder.abc299.c;

import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      int N = Integer.parseInt(scan.next());
      String S = scan.next();
      if (!S.contains("o") || !S.contains("-")) {
        System.out.println(-1);
        return;
      }
      String[] marks = S.split("");
      int count = 0;
      int max = 0;
      for (String s : marks) {
        if ("o".equals(s)) {
          if (++count > max) {
            max = count;
          }
        }
        if ("-".equals(s)) {
          count = 0;
        }
      }
      System.out.println(max);
    }
  }
}