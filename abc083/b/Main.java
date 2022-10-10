package atcoder.abc083.b;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
      try(Scanner scan = new Scanner(System.in)){
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int count = 0;

        for(int i =1; i <= N; i++){
          String n = String.valueOf(i);
          String nlines[] = n.split("");
          int value = 0;

          for(String nline: nlines){
            value = value + Integer.parseInt(nline);
          }

          if(Math.max(A, value) == Math.min(value, B)){
            count = count + i;
          }

        }

        System.out.println(count);
    }
  }
}