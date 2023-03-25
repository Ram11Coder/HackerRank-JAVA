package com.algo;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
  public static boolean isGregorian(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }
  /*
   * Complete the 'dayOfProgrammer' function below.
   *
   * The function is expected to return a STRING. The function accepts INTEGER year as parameter.
   */

  public static String dayOfProgrammer(int year) {

    if (year == 1918) {
      return "26.09." + year;
    }
    
    //Julian calender
    if (year >= 1700 && year <= 1917) {
      if (year % 4 == 0)
        return "12.09." + year;
      else
        return "13.09." + year;
    } else {
    //regorian calender(since 1919)
      if (isGregorian(year))
        return "12.09." + year;
      else
        return "13.09." + year;
    }
  }
}


public class Algo15 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    // BufferedWriter bufferedWriter = new BufferedWriter(new
    // FileWriter(System.getenv("OUTPUT_PATH")));

    int year = Integer.parseInt(bufferedReader.readLine().trim());

    String result = Result.dayOfProgrammer(year);
    System.out.println(result);
    // bufferedWriter.write(result);
    // bufferedWriter.newLine();

    bufferedReader.close();
    // bufferedWriter.close();
  }
}


