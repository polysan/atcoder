package atcoder.abc275.a;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = scan.nextInt();
          int answer = 0;
          int id = 1;
          int aa[] = new int[N];
          for(int i = 0; i < N; i++){
            aa[i] = scan.nextInt();
          }
          for(int i = 0; i < N; i++){
            if(answer < aa[i]){
              answer = aa[i];
              id = i+1;
            }
          }
          System.out.println(id);
        }
    }
}