package atcoder.abc294.a;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          for(int i = 0; i < N; i++){
            int num = Integer.parseInt(scan.next());
            if(num%2 == 0){
              System.out.print(num + " ");
            }
          }
        }
    }
}