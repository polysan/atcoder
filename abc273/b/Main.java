package atcoder.abc273.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){

          double X =  Double.parseDouble(scan.next());          
          int K = Integer.parseInt(scan.next());

          long Ruizyo;
          for(int i = 0; i < K; i++){
            Ruizyo = (long)Math.pow(10, i+1);
            X = (Math.round(X / Ruizyo))*Ruizyo;
          }
          
          System.out.println((long)X);
        }
    }
}