package strings;

import java.io.IOException;
import java.util.Scanner;

/**
 *Input
12.12.12.12
13.13.13.112
VUUT.12.12
111.111.11.111
1.1.1.1.1.1.1
.....
1...1..1..1
0.0.0.0
255.0.255.0
266.266.266.266
00000.000000.0000000.00001
0023.0012.0012.0034

Output
true
true
false
true
false
false
false
true
true
false
false
false
 */
class Regex {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next().trim();
			System.out.println(IP.matches(new MyRegex().pattern));

		}
		in.close();
	}
}

class MyRegex {

	public String pattern = "^(?:25[0-5]|2[0-4]\\d|[0-1]?\\d{1,2})(?:\\.(?:25[0-5]|2[0-4]\\d|[0-1]?\\d{1,2})){3}$";
}

