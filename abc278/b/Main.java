package atcoder.abc278.b;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int H = Integer.parseInt(scan.next());
          int M = Integer.parseInt(scan.next());
          int a=0;
          int b=0;
          int c=0;
          int d=0;
          if(String.valueOf(H).length() == 1){
            a = 0;
            b = H;
          }
          if(String.valueOf(H).length() == 2){
            a = (H/10)%10;
            b = H%10;
          }
          if(String.valueOf(M).length() == 1){
            c = 0;
            d = M;
          }
          if(String.valueOf(M).length() == 2){
            c = (M/10)%10;
            d = M%10;
          }
          String AB = String.valueOf(a)+String.valueOf(b);
          String CD = String.valueOf(c)+String.valueOf(d);
          int ab=Integer.parseInt(AB);
          int cd=Integer.parseInt(CD);
          while(true){
            int tempA = (ab/10)%10;
            int tempB = ab%10;
            int tempC = (cd/10)%10;
            int tempD = cd%10;
            String tempAB = String.valueOf(tempA)+String.valueOf(tempC);
            String tempCD = String.valueOf(tempB)+String.valueOf(tempD);
            int tempab = Integer.parseInt(tempAB);
            int tempcd = Integer.parseInt(tempCD);
            if(tempab >= 0 && tempab <= 23 && tempcd >= 0 && tempcd <= 59){
              System.out.println(ab  + " " + cd);
              return;
            }
            cd+=1;
            if(cd==60){
              cd=0;
              ab+=1;
            }
          }       
        }
    }
}