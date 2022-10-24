package atcoder.abc270.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int X = Integer.parseInt(scan.next());
          int Y = Integer.parseInt(scan.next());
          int Z = Integer.parseInt(scan.next());
          
          if((X > 0 && Y < 0) || (X < 0 && Y > 0) || (X > 0 && Y > X) || (X < 0 && X > Y)){
            System.out.println(Math.abs(X));
            return;
          }

          if(X > 0 && Y > 0 && Z > Y || X < 0 && Y < 0 && Z < Y){
            System.out.println(-1);
            return;
          }

          if(X > 0 && Z > 0 || X < 0 && Z < 0){
            System.out.println(Math.abs(X));
          }else{
            System.out.println(Math.abs(X) + Math.abs(Z) + Math.abs(Z));
          }
        }
    }
}