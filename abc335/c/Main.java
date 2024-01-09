package atcoder.abc335.c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int N = Integer.parseInt(scan.next());
			int Q = Integer.parseInt(scan.next());
			int[][] arr = new int[N][2];

			for (int i = 0; i < N; i++) {
				arr[i][0] = i + 1;
				arr[i][1] = 0;
			}

			for (int i = 0; i < Q; i++) {

				int qery = Integer.parseInt(scan.next());

				if (qery == 2) {
					int num = Integer.parseInt(scan.next());
					System.out.print(arr[num - 1][0]);
					System.out.print(" ");
					System.out.print(arr[num - 1][1]);
					System.out.println();
				}

				if (qery == 1) {
					for (int l = N - 1; l > 0; l--) {
						arr[l][0] = arr[l - 1][0];
						arr[l][1] = arr[l - 1][1];
					}
					String move = scan.next();
					if ("U".equals(move)) {
						arr[0][1] = arr[0][1] + 1;
					}
					if ("D".equals(move)) {
						arr[0][1] = arr[0][1] - 1;
					}
					if ("R".equals(move)) {
						arr[0][0] = arr[0][0] + 1;
					}
					if ("L".equals(move)) {
						arr[0][0] = arr[0][0] - 1;
					}
				}

			}
		}
	}
}