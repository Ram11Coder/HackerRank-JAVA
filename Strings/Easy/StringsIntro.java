
import java.io.*;
import java.util.*;

public class StringsIntro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int count = A.length() + B.length();
		System.out.println(count);

		if (A.compareTo(B) > 0)
			System.out.println("Yes");
		else
			System.out.println("No");

		if (!Character.isUpperCase(A.charAt(0)))
			A = A.substring(0, 1).toUpperCase() + A.substring(1);

		if (!Character.isUpperCase(B.charAt(0)))
			B = B.substring(0, 1).toUpperCase() + B.substring(1);

		System.out.println(A + " " + B);
	}
}
