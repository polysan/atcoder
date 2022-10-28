package atcoder.abc269.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){

          String table [][] = new String[10][10];
          String line [];

          for(int i = 0; i < 10; i++){
            line = scan.next().split("");
            for(int l = 0; l < 10; l++){
              table[i][l] =  line[l];
            }
          }

          int a = 10;
          int b = 0;
          int c = 10;
          int d = 0;

          for(int i = 0; i < 10; i++){
            for(int l = 0; l < 10; l++){
              if(table[i][l].equals("#")){
                a = Math.min(a, i+1);
                b = Math.max(b, i+1);
                c = Math.min(c, l+1);
                d = Math.max(d, l+1);
              } 
            }
          }          

          System.out.print(a + " " + b);
          System.out.println();
          System.out.print(c + " " + d);
        }
    }
}