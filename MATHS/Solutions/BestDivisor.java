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


//Need to solve
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
divisorSum(n);
        bufferedReader.close();
    }
    
    public static void divisorSum(int n){
        int digitSum=0,value=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
             value=sumDigit(i);
            if(digitSum<value)
            digitSum=i;
            }
        }
        if(digitSum>sumDigit(n))
        System.out.println(digitSum); 
        else
        System.out.println(n); 
    }
    public static int sumDigit(int n){
        if(n<10){
            return n;
        }
        int value=0;
        while(n>0){
            value+=(n%10);
            n/=10;
        }
        return value;
    }
}
