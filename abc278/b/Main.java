package atcoder.abc278.b;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int H = Integer.parseInt(scan.next());
          int M = Integer.parseInt(scan.next());
          int a,b,c,d;
            a = (H/10)%10;
            b = H%10;
            c = (M/10)%10;
            d = M%10;
          int ab = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
          int cd = Integer.parseInt(String.valueOf(c)+String.valueOf(d));
          while(true){
            int tempA = (ab/10)%10;
            int tempB = ab%10;
            int tempC = (cd/10)%10;
            int tempD = cd%10;
            int tempAB = Integer.parseInt(String.valueOf(tempA)+String.valueOf(tempC));
            int tempCD = Integer.parseInt(String.valueOf(tempB)+String.valueOf(tempD));
            if(tempAB >= 0 && tempAB <= 23 && tempCD >= 0 && tempCD <= 59){
              System.out.println(ab  + " " + cd);
              return;
            }
            cd+=1;
            if(cd==60){
              cd=0;
              ab+=1;
            }
            if(ab==24){
              cd=0;
              ab=0;
            }
          }       
        }
    }
}