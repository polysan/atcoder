package atcoder.abc335.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String line = scan.next();
			int result = line.lastIndexOf("2023");
			String executedStr = line.substring(0, result) + "2024";
			System.out.println(executedStr);
		}
	}
}
