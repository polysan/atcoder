package atcoder.abc284.a;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          String [] S   = new String[N];
          for(int i = 0; i < N; i++){
            S[i] = scan.next();
          }
          for(int i = N-1; i >= 0 ; i--){
            System.out.println(S[i]);
          }
        }
    }
}