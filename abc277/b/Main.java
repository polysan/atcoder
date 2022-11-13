package atcoder.abc277.b;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          String input;
          String str[] = new String[N];

          for(int i = 0; i < N; i++){
            input = scan.next();
            if(!(isStart(input))){
              System.out.println("No");
              return;
            }
            if(!(isStartSecound(input))){
              System.out.println("No");
              return;
            }
            str[i] = input;
          }

          boolean isDuplicate = false;
          for (int i = 0; i < str.length; i++) {
            for (int k = 0; k < str.length; k++) {
                if (k != i && str[k].equals(str[i])) {
                  isDuplicate = true;
                }
            }
          }
          System.out.println(isDuplicate ? "No" : "Yes");
        }
    }



    static boolean isStart (String in){
      if((in.startsWith("H"))){
        return true;
      }
      if((in.startsWith("D"))){
        return true;
      }
      if((in.startsWith("C"))){
        return true;
      }
      if((in.startsWith("S"))){
        return true;
      }
      return false;
    }

    static boolean isStartSecound (String in){
      String second[] = {"A","2","3","4","5","6","7","8","9","T","J","Q","K"};
      for(String param:second){

        if((in.startsWith(param,1))){
          return true;
        }

      }
      return false;
    }
}