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

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String result="";
  int n = s.length();
        if (s != null && !s.isEmpty()) {
            String timeRange = s.substring(n - 2);
            int timeNumber = Integer.parseInt(s.substring(0, 2));
            if (timeRange.equals("PM") && timeNumber >= 1 && timeNumber <= 11) {
                timeNumber += 12;
            } else if (timeRange.equals("AM") && timeNumber == 12) {
                timeNumber -= 12;
            }
            String hour = (timeNumber >= 0 && timeNumber <= 9) ? "0" + timeNumber : String.valueOf(timeNumber);

            result=hour + s.substring(2, n - 2);

}
return result;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
