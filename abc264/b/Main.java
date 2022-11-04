package atcoder.abc264.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){

          int R = Integer.parseInt(scan.next()); 
          int C = Integer.parseInt(scan.next()); 
          int [][] pic = new int [15][15];
          final int BLACK = 1;
          final int WHITE = 0;
          
          int value = 0;
          for(int i = 0; i < 15; i++){
            int Max = 14;
            Max = Max - i;
            for(int l = i; l < 15 - i; l++){

              // 黒 = 1 
              if(i%2 == 0){
                value = BLACK;
              }

              // 白 = 0
              if(i%2 != 0){
                value = WHITE;
              }

              pic[l][i] = value;
              pic[i][l] = value;
              pic[Max][l] = value;
              pic[l][Max] = value;
            }
          }
          if(pic[R-1][C-1] == BLACK){
            System.out.println("black");
            return;
          }
          System.out.println("white");
        }
    }
}