package atcoder.abc333.c;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = Integer.parseInt(scan.next());
			long[] arr = new long[12];
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < 12; i++) {
				sb.append("1");
				arr[i] = Long.valueOf(sb.toString());
			}

			Set<Long> addition = new HashSet<Long>();

			for (int i = 0; i < arr.length; i++) {
				for (int i2 = 0; i2 < arr.length; i2++) {
					for (int i3 = 0; i3 < arr.length; i3++) {
						addition.add(arr[i] + arr[i2] + arr[i3]);
					}
				}
			}

			List<Long> sortedAddition = addition.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedAddition.get(N - 1));
		}
	}
}
