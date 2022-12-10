package atcoder.abc281.a;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          for(int i = N; i >= 0; i--){
            System.out.println(i);
          }
          System.out.println();
        }
    }
}