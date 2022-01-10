package com.hackerrank;

import java.io.*;
import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
