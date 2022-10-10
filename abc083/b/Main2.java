package atcoder.abc083.b;

import java.util.Scanner;

public class Main2 {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = scan.nextInt();
          int A = scan.nextInt();
          int B = scan.nextInt();
          int count = 0;
  
          for(int i =1; i <= N; i++){    
            int value = findSumOfDigits(i);
  
            if(Math.max(A, value) == Math.min(value, B)){
              count = count + i;
            }
          }
  
          System.out.println(count);
      }
    }
    static int findSumOfDigits(int n){
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
