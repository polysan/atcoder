package atcoder.abc294.c;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      int N = Integer.parseInt(scan.next());
      int M = Integer.parseInt(scan.next());
      int [] listA = new int[N];
      int [] listB = new int[M];
      
      Map<Integer, Integer> map = new TreeMap<>();
      for (int i = 0; i < N; i++) {
        map.put(Integer.parseInt(scan.next()),i);
      }
      for (int i = N; i < N+M; i++) {
        map.put(Integer.parseInt(scan.next()),i);
      }
      int count = 0;
      for (int val : map.values()) {
        count++;
        if(val < N){
          listA[val] = count;
          continue;
        }
        listB[val-N] = count; 
      }
      for(int val : listA){
        System.out.print(val + " ");
      }
      System.out.println();
      for(int val : listB){
        System.out.print(val + " ");
      }
    }
  }
}
