package com.biginteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegerSample {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num1 = br.readLine();
		BigInteger b1 = new BigInteger(num1);
		String num2 = br.readLine();
		BigInteger b2 = new BigInteger(num2);

		System.out.println(b1.add(b2));
		System.out.println(b1.multiply(b2));
		br.close();
	}
}