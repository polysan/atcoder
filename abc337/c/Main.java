package atcoder.abc337.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = Integer.parseInt(scan.next());

			Map<Integer, Integer> humans = new HashMap<>();
			List<Integer> humansSortOrder = new ArrayList<Integer>();

			IntStream.range(0, N).forEach(i -> humans.put(Integer.parseInt(scan.next()), i + 1));
			humansSortOrder.add(humans.get(-1));

			IntStream.range(humansSortOrder.size(), N).map(i -> humans.get(humansSortOrder.get(i - 1)))
					.forEach(i -> humansSortOrder.add(i));
			humansSortOrder.stream().forEach(i -> System.out.print(i + " "));
		}
	}
}
