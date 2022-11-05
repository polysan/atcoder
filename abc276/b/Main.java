package atcoder.abc276.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next()); // 都市
          int M = Integer.parseInt(scan.next()); // 道路
          
          List<List<Integer>> list = new ArrayList<>();
          for(int i = 0; i < N; i++){
            List<Integer> list2 = new ArrayList<>();
            list.add(i,list2);
          }
          for(int i = 0; i < M; i++){
            int A = Integer.parseInt(scan.next());
            int B = Integer.parseInt(scan.next());
            List<Integer> a = list.get(A-1);
            a.add(B);
            List<Integer> b = list.get(B-1);
            b.add(A);
          }
          for(int i = 0; i < list.size(); i++){
            Collections.sort(list.get(i));
          }

          for(int i = 0; i < list.size(); i++){
            int size = list.get(i).size();
            System.out.print(size);
            List<Integer> aa = list.get(i);
              for(int t = 0; t < aa.size(); t++){
                System.out.print( " " + aa.get(t));
              }
            System.out.println("");
          }
        }
    }
}