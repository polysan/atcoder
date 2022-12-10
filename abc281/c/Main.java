package atcoder.abc281.c;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          long T = scan.nextLong();
          int playList[] = new int[N];
          long total = 0;
          for(int i = 0; i < N; i++){
            playList[i] = Integer.parseInt(scan.next());
            total += playList[i];
          }
          if(T > total){
            long warizan = T/total;
            T = T - total*warizan;
          }
          Long num = T;
          int l = 0;
          while (true){
            num = num - playList[l];
            if(0 > num){
              break;
            }
            l++;
            if(l >= N ){
              l = 0;
            }
          }
          System.out.println(l+1 + " " + (playList[l]+num));
        }
    }
}