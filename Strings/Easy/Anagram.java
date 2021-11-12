package strings;

import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String a, String b) {
		if(a==null || b==null)
			return false;
		a = a.trim().toLowerCase();
		b = b.trim().toLowerCase();
	
		if (a.length() != b.length() || a.isEmpty() || b.isEmpty() )
			return false;

		int hash[] = new int[128];

		for (char c : a.toCharArray())
			hash[c]++;

		for (char c : b.toCharArray())
			hash[c]--;

		for (int c : hash)
			if (c != 0)
				return false;

		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();

		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}