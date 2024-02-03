package atcoder.abc337.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = Integer.parseInt(scan.next());
			int[] humans = new int[N];
			List<Integer> humansSortOrder = new ArrayList<Integer>();

			for (int i = 0; i < N; i++) {
				int input = Integer.parseInt(scan.next());
				humans[i] = input;
				if (input == -1) {
					humansSortOrder.add(i + 1);
				}
			}

			while (humansSortOrder.size() < N) {
				IntStream.range(0, humans.length)
						.filter(i -> humans[i] == humansSortOrder.get(humansSortOrder.size() - 1))
						.forEach(i -> humansSortOrder.add(i + 1));
			}
			humansSortOrder.forEach(value -> System.out.print(value + " "));
		}
	}
}
