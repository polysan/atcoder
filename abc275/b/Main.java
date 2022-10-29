package atcoder.abc275.b;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          final int mod = 998244353;
          long a =  scan.nextLong();
          long b =  scan.nextLong();
          long c =  scan.nextLong();
          long d =  scan.nextLong();
          long e =  scan.nextLong();
          long f =  scan.nextLong();
          long x = ((a % mod) * (b % mod)) % mod; 
          x = ((x) * (c % mod)) % mod; 
          long y = ((d % mod) * (e % mod)) % mod; 
          y = ((y ) * (f % mod)) % mod; 
          long result = (x+mod-y)%mod; 

          System.out.println(result);
        }
    }
}