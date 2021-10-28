package pack_27_oct;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticBlock {
	static private Scanner sc = new Scanner(System.in);
	static private boolean flag = false;
	static private int B, H;

	public static void check() throws Exception {
		B = sc.nextInt();
		H = sc.nextInt();
		if (B <= 0 || H <= 0) 
			throw new Exception("Breadth and height must be positive");
		else
			flag=true;
	}

	static {
		 try {
			check();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
