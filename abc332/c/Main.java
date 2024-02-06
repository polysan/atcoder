package atcoder.abc332.c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

			int N = Integer.parseInt(scan.next());
			int M = Integer.parseInt(scan.next());
			String S = scan.next();

			String[] marks = S.split("0");
			int ans = 0;
			for (int i = 0; i < marks.length; i++) {
				ans = Math.max(ans, solve(marks[i], M));
			}
			System.out.println(ans);
		}
	}

	static int solve(String s, int m) {
		int one = 0, two = 0;
		String[] marks = s.split("");
		for (int i = 0; i < marks.length; i++) {
			if ("".equals(marks[i])) {
				continue;
			} else if("1".equals(marks[i])) {
				one++;
			} else {
				two++;
			}
		}
		return (one + two) - Math.min(one, m);
	}
}
