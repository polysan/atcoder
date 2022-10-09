package atcoder.abc081.b;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = scan.nextInt();
          int count = 0;
          int[] num = new int[N];
          for(int i = 0;i < N; i++){
            num[i] = scan.nextInt();
          }
          while(true){
            int i = 0;
            for(i = 0; i < N; i++){
              if(num[i]%2 != 0){
                System.out.println(count);
                return;
              }
              num[i] = num[i]/2;
            }
            count++;
          }
        }
    }
}