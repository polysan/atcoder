package atcoder.abc278.c;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
         
          int N = Integer.parseInt(scan.next());
          int Q = Integer.parseInt(scan.next());
          Set<String> set = new HashSet<String>();
          int T,A,B;
          for(int i = 0; i < Q; i++){
             T = Integer.parseInt(scan.next());
             A = Integer.parseInt(scan.next());
             B = Integer.parseInt(scan.next());
             if(T == 1){
              set.add(A + " " + B);
             }
             if(T == 2){
              set.remove(A + " " + B);
             }
             if(T == 3){
              System.out.println(set.contains(A + " " + B)&&set.contains(B + " " + A) ? "Yes" : "No");
             }
          }
        }
    }
}