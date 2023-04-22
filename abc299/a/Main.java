package atcoder.abc299.a;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          // int S = Integer.parseInt(scan.next());
          // String a = scan.next();
          String line = scan.next();
          String[] marks = line.split("");
          int flg = 0;
          for (String mark : marks) {
            if(flg == 0 && "|".equals(mark)){
              flg = 1;
            }
            if(flg == 1 && "*".equals(mark)) {
              flg = 2;
            }
            if(flg == 2 && "|".equals(mark)) {
              System.out.println("in");
              return;
            }
          }
          System.out.println("out");
        }
    }
}