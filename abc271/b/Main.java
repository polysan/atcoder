package atcoder.abc271.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          int Q = Integer.parseInt(scan.next());
          
          int [][] sequence = new int [N][];
          for(int i = 0; i < N; i++){
            int L = Integer.parseInt(scan.next());
            sequence[i] = new int[L];
            for(int l = 0; l < L; l++){
              sequence[i][l] = Integer.parseInt(scan.next());
            }  
          }
          for(int i = 0; i < Q; i++){
            int S = Integer.parseInt(scan.next());
            int T = Integer.parseInt(scan.next());
            System.out.println(sequence[S-1][T-1]);
          }
        }
    }
}