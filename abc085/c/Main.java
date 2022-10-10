package atcoder.abc085.c;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
      try(Scanner scan = new Scanner(System.in)){
        int N = scan.nextInt();
        int Y = scan.nextInt();
        final int ichiman = 10000;
        final int gosen = 5000;
        final int sen = 1000;

        for(int i =0; i <= N; i++){
          for(int g =0; g <= N-i; g++){
              int s = N - i - g; 
              if(i * ichiman + g * gosen + s * sen == Y ){
                System.out.println(i + " " + g + " " + s);
                return;
              
            }
          }
        }
        System.out.println(-1 + " " + -1 + " " + -1);
    }
  }
}