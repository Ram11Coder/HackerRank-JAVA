import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
//One test case failed
class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
int minNumber = 0;
        if (password.matches("(.*)\\d(.*)")) {
            minNumber++;
        }
        System.out.println(minNumber);
        if (password.matches("(.*)[a-z](.*)")) {
            minNumber++;
        }
        System.out.println(minNumber);
        if (password.matches("(.*)[A-Z](.*)")) {
            minNumber++;
        }
        System.out.println(minNumber);
        if (password.matches("(.*)[!@#$%^&*()-+](.*)")) {
            minNumber++;
        }
        System.out.println(minNumber);
        int result = 0;
        if (n >= 6) {
            result = 4 - minNumber;
        } else if ((6 - n) >= 4 - minNumber) {
            result = 6 - n;
        } else {
            result = 4 - minNumber;
        }
        return result;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
