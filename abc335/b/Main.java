package atcoder.abc335.b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = Integer.parseInt(scan.next());
			for (int x = 0; x <= N; x++) {
				for (int y = 0; y <= N; y++) {
					for (int z = 0; z <= N; z++) {
						if (x + y + z <= N) {
							System.out.println(x + " " + y + " " + z);
						}
					}
				}
			}
		}
	}
}
