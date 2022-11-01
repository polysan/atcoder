package atcoder.abc265.b;

import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){

          int N = Integer.parseInt(scan.next()); // 部屋の数
          int M = Integer.parseInt(scan.next()); // ボーナス部屋の数
          long T = Integer.parseInt(scan.next()); // // 持ち時間
          int [] useTime = new int[N-1];
          int [] bonus = new int[N-1];

          // 消費時間
          for(int i = 0; i < N-1; i++){
            useTime[i] = Integer.parseInt(scan.next());
          }

          // ボーナス部屋
          for(int i = 0; i < M; i++){
            int roomNum = Integer.parseInt(scan.next())-1;
            int plusTime = Integer.parseInt(scan.next());
            bonus[roomNum] = plusTime; 
          }
          for(int i = 0; i < N-1; i++){
            T += bonus[i];
            T -= useTime[i];
            if(T < 1){
              System.out.println("No");
              return;
            }
          }
          System.out.println("Yes");
        }
    }
}