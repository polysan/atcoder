package atcoder.abc278.a;



import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          int K = Integer.parseInt(scan.next());
          int aa[] = new int[N];
          for(int i = 0; i < N; i++){
            aa[i] = Integer.parseInt(scan.next());
          }
          for(int i = 0; i < K; i++){
            for(int l = 0; l < aa.length-1; l++){
              aa[l] = aa[l+1];
            }
            aa[N-1] = 0;
          }
          System.out.print(aa[0]);
          for(int l = 1; l < aa.length; l++){
            System.out.print(" " + aa[l]);
          }
          // for(int a: aa){
            
          // }
          
        }
    }
}