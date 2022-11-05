package atcoder.abc276.a;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          String S = scan.next();
          String marks[] = S.split("");
          int num = 101;
          for(int i = 0; i < marks.length; i++){
            if("a".equals(marks[i])){
              num = i+1;
             }
          }
          if(num == 101){
            System.out.println(-1);
            return;
          }
          System.out.println(num);
        }
    }
}