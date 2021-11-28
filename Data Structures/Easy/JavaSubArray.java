package com.hackerrank;

import java.util.Scanner;

public class JavaSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n - i; j++)
				if (subArray(arr, i, j) < 0)
					count++;
		System.out.println(count);
		sc.close();
	}

	private static int subArray(int[] arr, int i, int j) {
		int sum = 0;
		for (int k = j; k <= i + j; k++)
			sum += arr[k];
		return sum;
	}
}
