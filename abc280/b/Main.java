package atcoder.abc280.b;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          int value;
          int pre = 0;
          int [] a = new int[N];
          for(int i = 0; i < N; i++){
            value = Integer.parseInt(scan.next());
            a[i] = value -pre;
            pre = value;
          }
          for(int aa: a){
            System.out.print(aa + " ");
          }
        }
    }
}