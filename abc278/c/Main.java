

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
         
          int N = Integer.parseInt(scan.next());
          int Q = Integer.parseInt(scan.next());
          boolean [][] glf = new boolean[N+1][N+1];
          int T;
          int A;
          int B;
          for(int i = 0; i < Q; i++){
             T = Integer.parseInt(scan.next());
             A = Integer.parseInt(scan.next());
             B = Integer.parseInt(scan.next());
             if(T == 1){
              follow(A,B,glf);
             }
             if(T == 2){
              followOut(A,B,glf);
             }
             if(T == 3){
              System.out.println(glf[A][B]&&glf[B][A] ? "Yes" : "No");
             }
          }
        }
    }
    static void follow(int follower,int followed,boolean[][] glf){
      glf[follower][followed] = true;
    }
    static void followOut(int follower,int followed,boolean[][] glf){
      glf[follower][followed] = false;
    }
}