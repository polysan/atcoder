package atcoder.abc266.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){

          long N = scan.nextLong();
          final int mod = 998244353;

          for(int x = 0; x < mod; x++){
            if((N-x)%998244353 == 0){
              System.out.println(x);
              return;
            }
          }          
        }
    }
}