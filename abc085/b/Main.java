package atcoder.abc085.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
      try(Scanner scan = new Scanner(System.in)){
        int N = scan.nextInt();
        int[] mochi = new int[N];
        
        for(int i =0; i < N; i++){
          mochi[i] = scan.nextInt();
        }
        long count = Arrays.stream(mochi).distinct().count();
        System.out.println(count);
    }
  }
}