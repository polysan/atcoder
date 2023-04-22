package atcoder.abc299.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          int T = Integer.parseInt(scan.next());
          int [] colors = new int[N];
          int [] values = new int[N];
          List<Player> players = new ArrayList<Player>();
          
          for(int i = 0; i < N; i++){
            colors[i] = Integer.parseInt(scan.next());
          }
          for(int i = 0; i < N; i++){
            values[i] = Integer.parseInt(scan.next());
          }
          for(int i = 0; i < N; i++){
            Player player = new Player(colors[i], values[i], i+1);
            players.add(player);
          }
          
          List<Player> filersPlayers = players.stream().
          filter(player -> player.getColor() == T).collect(Collectors.toList());

          if(filersPlayers.size() < 1) {
            int oneColor = players.get(0).getColor();
            filersPlayers = players.stream().
            filter(player -> player.getColor() == oneColor).collect(Collectors.toList());
          }

          Player result = filersPlayers.stream().max(Comparator.comparingInt(Player::getValue)).get();
          System.out.println(result.getIndex());

        }
    }
}
class Player {
  int color;
  int value;
  int index;
  public Player(int color, int value, int index) {
    this.color = color;
    this.value = value;
    this.index = index;
  }

  public int getColor() {
      return color;
  }
  public int getValue() {
      return value;
  }
  public int getIndex() {
      return index;
  }
  public void setColor(int color) {
      this.color = color;
  }
  public void setValue(int value) {
      this.value = value;
  }
  public void setIndex(int index) {
      this.index = index;
  }
}