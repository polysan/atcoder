
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          int P = Integer.parseInt(scan.next());
          int Q = Integer.parseInt(scan.next());
          int R = Integer.parseInt(scan.next());
          int S = Integer.parseInt(scan.next());
          int[] marks= new int[N];
          int[] pToQ=new int[Q-P+1];
          int[] rToS=new int[S-R+1];
          for(int i = 0; i < N; i++){
            marks[i] = Integer.parseInt(scan.next());;
          }
          int countPToQ = 0;
          for(int p = P; p <= Q; p++){
            pToQ[countPToQ] = marks[p-1];
            countPToQ++;
          }
          int countRToS = 0;
          for(int r = R; r <= S; r++){
            rToS[countRToS] = marks[r-1];
            countRToS++;
          }
          int rr = R;
          for(int i = 0; i < pToQ.length; i++){
            marks[rr-1] = pToQ[i];
            rr++;
          }
          int pp = P;
          for(int i = 0; i < rToS.length; i++){
            marks[pp-1] = rToS[i];
            pp++;
          }
          for(int mark : marks){
            System.out.print(mark + " ");
          }
          
        }
    }
}