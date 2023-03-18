package atcoder.abc101.a;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
      final String plus = "+";
      try(Scanner scan = new Scanner(System.in)){
        int total = 0;
        
        String line = scan.nextLine();
        String[] marks = line.split("");
        for(String mark : marks){
          total = total + (mark.equals(plus)  ? 1 : -1);
        }         
        System.out.println(total);
      }
    }
}