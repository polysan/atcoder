package atcoder.abc294.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  static Map<Integer, String> map = new HashMap<>();
  static String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
  static {
      for(int i = 0; i < alphabet.length; i++){
        map.put(i+1,alphabet[i]);
      }
    }

  
  public static void main(String [] args) {
    try(Scanner scan = new Scanner(System.in)){
          int H = Integer.parseInt(scan.next());
          int W = Integer.parseInt(scan.next());
          for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
              int num = Integer.parseInt(scan.next());
              if(num == 0){
                System.out.print(".");
                continue;  
              }
              System.out.print(map.get(num));
            }
            System.out.println();
          }
        }
    }
}