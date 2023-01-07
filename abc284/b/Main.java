import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int T = Integer.parseInt(scan.next());
          for(int i = 0; i < T; i++){
            int N = Integer.parseInt(scan.next());
            int count = 0;
            for(int j = 0; j < N; j++){
              int M = Integer.parseInt(scan.next());
              if(M%2 != 0){
                count++;
              }
            }
            System.out.println(count);
          }
        }
    }
}