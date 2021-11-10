
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubstringComparision {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < s.length() - (k - 1); i++)
			list.add(s.substring(i, i + k));

		Collections.sort(list);
		smallest = list.get(0);
		largest = list.get(list.size() - 1);

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();
		System.out.println(bruteForce(s, k));
		
		//System.out.println(getSmallestAndLargest(s, k));
	}

	private static String bruteForce(String s, int k) {
		String smallest = "";
		String largest = "";
		String[] word = new String[s.length() - (k - 1)];
		for (int i = 0; i < s.length() - (k - 1); i++) 
			word[i] = s.substring(i, i + k);
		
		for (int i = 0; i < word.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < word.length; j++) 
				if (word[minIndex].compareTo(word[j]) > 0) 
					minIndex = j;
				
			String temp = word[i];
			word[i] = word[minIndex];
			word[minIndex] = temp;
		}
		
		smallest = word[0];
		largest = word[word.length - 1];
		return smallest + "\n" + largest;
	}
}