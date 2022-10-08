import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int total = 0;
        
          String N = scan.nextLine();
          String[] ketasuchi = N.split("");
          for(String suchi : ketasuchi){
            total = total + Integer.parseInt(suchi);
          }
          System.out.println(Integer.parseInt(N)%total == 0 ? "Yes" : "No");
        }
    }
}