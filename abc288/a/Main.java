import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          long N = scan.nextLong();
          for(int i = 0; i < N; i++){
            long A = Integer.parseInt(scan.next());
            long B = Integer.parseInt(scan.next());
            System.out.println(A+B);  
          }
        }
    }
}