package atcoder.abc279.a;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          String S = scan.next();
          String[] marks = S.split("");
          int count = 0;
          for(String s: marks){
            if("v".equals(s)){
              count++;
            }
            if("w".equals(s)){
              count = count + 2;
            }
          }
          System.out.println(count);
        }
    }
}