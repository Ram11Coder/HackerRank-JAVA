package com.hackerrank;

import java.util.*;

public class Java1DPart2 {

	public static boolean canWin(int leap, int[] game) {

		return checkPossibilityOfWin(leap, game, 0);
	}

	private static boolean checkPossibilityOfWin(int leap, int[] game, int i) {
		if (i < 0 || game[i] == 1)
			return false;
		if (i == game.length - 1 || i + leap > game.length - 1)
			return true;
		game[i] = 1;
		return checkPossibilityOfWin(leap, game, i + 1) || checkPossibilityOfWin(leap, game, i - 1)
				|| checkPossibilityOfWin(leap, game, i + leap);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}