package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<List<Integer>> list = new ArrayList<List<Integer>>(n);
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			List<Integer> list1 = new ArrayList<Integer>(c);
			for (int j = 0; j < c; j++)
				list1.add(sc.nextInt());
			list.add(list1);
		}
		int q = sc.nextInt();
		List<List<Integer>> qList = new ArrayList<List<Integer>>(q);

		for (int i = 0; i < q; i++) {
			List<Integer> point = new ArrayList<Integer>();
			for (int j = 0; j < 2; j++)
				point.add(sc.nextInt());
			qList.add(point);
		}

		for (int i = 0; i < qList.size(); i++) {
			int x = qList.get(i).get(0) - 1;
			int y = qList.get(i).get(1) - 1;
			if (x < list.size() && y < list.get(x).size())
				System.out.println(list.get(x).get(y));
			else
				System.out.println("ERROR!");
		}
		sc.close();
	}

}
