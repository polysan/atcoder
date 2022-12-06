package atcoder.abc280.a;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int H = Integer.parseInt(scan.next());
          int W = Integer.parseInt(scan.next());
          int count = 0;
          for(int i = 0; i < H; i++){
            String line = scan.next();
            String[] marks = line.split("");
            for(int l = 0; l < marks.length; l++){
              if("#".equals(marks[l]) ){
                count++;
              }
            }
          }
          System.out.println(count);
        }
    }
}