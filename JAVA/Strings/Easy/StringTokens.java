package strings;

import java.io.*;
import java.util.*;

public class StringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		s=s.trim();
		if (s.length() == 0) {
			System.out.println(0);
		} else {
			String words[] = s.split("[ !,?._'@]+");
			System.out.println(words.length);
			for (String word : words)
				System.out.println(word);
		}
	}
}
