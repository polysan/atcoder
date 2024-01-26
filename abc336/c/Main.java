 package atcoder.abc336.c;

 import java.util.Scanner;

 public class Main {
     public static void main(String [] args) {
         try(Scanner scan = new Scanner(System.in)){
        	 Long N = scan.nextLong();
        	 int count = 1;
        	 String value = "0";
        	 while (count < N) {
        		 value = String.valueOf(Integer.parseInt(value) + 2);
        		 if(!value.matches("(.*)[13579](.*)")) {
        			 count++;
        		 }
        	 }
        	 System.out.println(value);
         }
     }
 }
