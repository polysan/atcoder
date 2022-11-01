package atcoder.abc267.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){

          String S = scan.next();
          boolean [] line = new boolean [7];
          String[] input = S.split("");
          
          if("1".equals(input[0])){
            System.out.println("No");
            return;
          }

          line[0] = "1".equals(input[6]);
          line[1] = "1".equals(input[3]);
          line[2] = "1".equals(input[1]) || "1".equals(input[7]);
          line[3] = "1".equals(input[4]);
          line[4] = "1".equals(input[2]) || "1".equals(input[8]);
          line[5] = "1".equals(input[5]);
          line[6] = "1".equals(input[9]);

          for(int i = 0; i < line.length; i++){
            if(line[i]){
              for(int l = i+1; l < line.length; l++){
                if(!line[l]){
                  for(int t = l+1; t < line.length; t++){
                    if(line[t]){
                      System.out.println("Yes");
                      return;
                    }
                  }
                }
              }
            }
          }
          System.out.println("No");
        }
    }
}