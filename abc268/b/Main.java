package atcoder.abc268.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){

          String S = scan.next();
          String T = scan.next();

          if(T.indexOf(S)==0){
            System.out.println("Yes");
            return;  
          }
          
          System.out.println("No");
        }
    }
}