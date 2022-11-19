package atcoder.abc260.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){

          int N = Integer.parseInt(scan.next()); 
          int X = Integer.parseInt(scan.next()); 
          int Y = Integer.parseInt(scan.next()); 
          int Z = Integer.parseInt(scan.next()); 

          int[][] score = new int[N][3];

          List<Integer> successfulExaminee = new ArrayList<Integer>();
          for(int i = 0; i < 2; i++){
            for(int l = 0; l < N; l++){
              score[l][i] = Integer.parseInt(scan.next());
            }
          }
          for(int i = 0; i < X; i++){
          int xMax = -1;
          int xMaxIndex = -1;
            for(int l = 0; l < N; l++){
              if(xMax < score[l][0] && score[l][2] != 1){
                xMax = score[l][0];
                xMaxIndex = l;
              }
            }
            // [][2] = 1だとすでに順位付けされている
            score[xMaxIndex][2] = 1;
            successfulExaminee.add(xMaxIndex+1);
          }
          for(int i = 0; i < Y; i++){
            int yMax = -1;
            int yMaxIndex = -1;
              for(int l = 0; l < N; l++){
                if(yMax < score[l][1] && score[l][2] != 1){
                  yMax = score[l][1];
                  yMaxIndex = l;
                }
              }
              score[yMaxIndex][2] = 1;
              successfulExaminee.add(yMaxIndex+1);
          }
          for(int i = 0; i < Z; i++){
            int totalMax = -1;
            int totalMaxIndex = -1;
              for(int l = 0; l < N; l++){
                if(totalMax < score[l][0]+score[l][1] && score[l][2] != 1){
                  totalMax = score[l][0]+score[l][1];
                  totalMaxIndex = l;
                }
              }
              score[totalMaxIndex][2] = 1;
              successfulExaminee.add(totalMaxIndex+1);
          }
          Collections.sort(successfulExaminee);

          for(Integer value : successfulExaminee){
            System.out.println(value);
          }
        }
    }
}