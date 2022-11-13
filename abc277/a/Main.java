package atcoder.abc277.a;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          int X = Integer.parseInt(scan.next());

          for(int i = 0; i < N; i++){
            if(X == Integer.parseInt(scan.next())){
              System.out.println(i+1);
            }
          }
        }
    }
}