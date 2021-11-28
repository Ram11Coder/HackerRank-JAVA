package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++)
			list.add(sc.nextInt());
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			String query = sc.next();
			if (query.contains("Insert")) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				list.add(x, y);
			} else if (query.contains("Delete")) {
				int x = sc.nextInt();
				list.remove(x);
			}
		}
		for (int i : list)
			System.out.print(i + " ");

		sc.close();
	}

}
