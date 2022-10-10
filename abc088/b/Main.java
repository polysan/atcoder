package atcoder.abc088.b;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
      try(Scanner scan = new Scanner(System.in)){
        int N = scan.nextInt();
        int Alice = 0; 
        int Bob = 0; 
        Integer cards[] = new Integer[N];

        for(int i = 0; i < N; i++){
          cards[i] = scan.nextInt();
        }

        Arrays.sort(cards, Comparator.reverseOrder());
        
        for(int i = 0; i < N; i++){
          if(i%2==0){
            Alice += cards[i];
          }else{
            Bob += cards[i];
          }
        }
        
        System.out.println(Alice - Bob);
      }
  }
}