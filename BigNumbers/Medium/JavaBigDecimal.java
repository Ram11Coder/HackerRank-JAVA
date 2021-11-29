package com.hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

class JavaBigDecimal {
	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		BigDecimal bd[] = new BigDecimal[n];

		for (int i = 0; i < n; i++) {
			bd[i] = new BigDecimal(s[i]);
		}

		for (int i = 1; i < bd.length; i++) {
			BigDecimal key = bd[i];
			int j = i - 1;
			String key1 = s[i];
			while (j >= 0 && bd[j].compareTo(key) == -1) {
				bd[j + 1] = bd[j];
				s[j + 1] = s[j];
				j--;
			}
			bd[j + 1] = key;
			s[j + 1] = key1;
		}

		// Write your code here
//Based on precision and scale execute your logic
		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}