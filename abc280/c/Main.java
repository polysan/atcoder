package atcoder.abc280.c;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          String S = scan.next();
          String T = scan.next(); 
          String[] sValue = S.split("");
          String[] tValue = T.split("");
          
          for(int i = 0; i < sValue.length; i++){
            if(!sValue[i].equals(tValue[i])){
              System.out.println(i+1);
              return;
            }
          }
          System.out.println(tValue.length);
        }
    }
}