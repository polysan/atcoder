package atcoder.abc281.b;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){

          String S = scan.next();
          String head = S.substring(0, 1);
          Pattern headPtn = Pattern.compile("^[A-Z].*$");
          Matcher matcherHead = headPtn.matcher(head);

          String num = S.substring(1, 7);
          int numOfInt = Integer.parseInt(num);
          int numLength = String.valueOf(numOfInt).length();

          String end = S.substring(7, 8);
          Pattern endPtn = Pattern.compile(".*[A-Z]$");
          Matcher matcherEnd = endPtn.matcher(end);

          if(!matcherHead.find()){
            System.out.println("No");
            return;
          }
          if(numLength != 6){
            System.out.println("No");
            return;
          }
          if(!matcherEnd.find()){
            System.out.println("No");
            return;
          }

          System.out.println("Yes");

        }catch(Exception e){
          System.out.println("No");
        }
    }
}