package atcoder.abc274.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int H = Integer.parseInt(scan.next());
          int W = Integer.parseInt(scan.next());

          String [][] aa = new String[H][W];

          String line;
          String marks[];

          for(int i = 0; i < H; i++){
            line = scan.next();
            marks = line.split("");
            aa[i] = marks;
          }

          for(int i = 0; i < W; i++){
            int count = 0;
            for(int l = 0; l < H; l++){  
              if("#".equals(aa[l][i])){
                count++; 
              }
            }
            System.out.print(count + " ");
          }           
        }
    }
}