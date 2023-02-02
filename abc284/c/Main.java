import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int u;
	static int v;
	static boolean[] isVisited;
	static List<Integer> graphLinkList;
	static List<List<Integer>> graph = new ArrayList<>();;
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int N = Integer.parseInt(scan.next());
          int M = Integer.parseInt(scan.next());

		  for(int i = 0; i < N; i++) graph.add(i, new ArrayList<>());
		  
		  for(int i = 0; i < M; i++){
			u = Integer.parseInt(scan.next());
			v = Integer.parseInt(scan.next());
			u--; v--;
			graph.get(u).add(v);
			graph.get(v).add(u);
		  }

		  isVisited = new boolean[N];
		  int count = 0;

		  for(int i = 0; i < N; i++){
			if(isVisited[i]) continue;
			dfs(i);
			count++;
		  }

        System.out.println(count);
    	}
	}
	static void dfs (int n) {

		graphLinkList = graph.get(n);
		isVisited[n] = true;

		for(int next_n : graphLinkList){
			if(isVisited[next_n]) continue;
			dfs(next_n);
		}
	}
}