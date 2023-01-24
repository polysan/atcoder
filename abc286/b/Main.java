import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          String S = scan.next();
          String str2 = S.replace("na", "nya");
          System.out.println(str2);
        }
    }
}