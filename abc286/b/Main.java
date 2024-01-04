package atcoder.abc286.b;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          String S = scan.next();
          String str2 = S.replace("na", "nya");
          System.out.println(str2);
        }
    }
}