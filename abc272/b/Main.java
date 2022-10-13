package atcoder.abc272.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = scan.nextInt();
          int M = scan.nextInt();
          boolean [][] kumiawase = new boolean[N][N];
          
          for(int i = 0; i < M; i++){
            int K = scan.nextInt();
            int [] butou = new int[K];
            for(int k = 0; k < K; k++){
              butou[k] = scan.nextInt();
            }
            for(int b: butou){
              for(int t: butou){
                kumiawase[b-1][t-1] = true;
              }
            }
          }
 
          for(int i = 0; i < N; i++){
            for(int l = 0; l < N; l++){
              if(kumiawase[i][l] == false){
                System.out.println("No");
                return;      
              }
            }
          }
          System.out.println("Yes");
        }
    }
}