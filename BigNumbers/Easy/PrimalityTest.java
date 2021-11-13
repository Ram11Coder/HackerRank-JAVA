package com.biginteger;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrimalityTest {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String n = bufferedReader.readLine();
		BigInteger b = new BigInteger(n);
		if (b.isProbablePrime(1))
			System.out.println("prime");
		else
			System.out.println("not prime");

		// System.out.println((b.isProbablePrime(100)) ? "prime" : "not prime");

		bufferedReader.close();
	}
}
