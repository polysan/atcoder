package atcoder.abc262.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){

          int N = Integer.parseInt(scan.next()); 
          int M = Integer.parseInt(scan.next()); 
          int [][] fig = new int [N][N];
          
          for(int i = 0; i < M; i++){
            int value1 = Integer.parseInt(scan.next())-1; 
            int value2 = Integer.parseInt(scan.next())-1; 
            fig[value1][value2] = 1; 
            fig[value2][value1] = 1; 
          }
          
          int count = 0;
          
          for(int a = 0; a < N; a++){
            for(int b = 0; b < N; b++){
              for(int c = 0; c < N; c++){
                if(!(fig[a][b] == 1 || fig[b][a] == 1)){
                  continue;
                }
                if(!(fig[b][c] == 1 || fig[c][b] == 1)){
                  continue;
                }
                if(!(fig[c][a] == 1 || fig[a][c] == 1)){
                  continue;
                }
                if(a < b && b < c){
                  count++;
                }
              }
            }
          }
          System.out.println(count);
        }
    }
}