import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*
regex_1(?=regex_2)
The positive lookahead (?=) asserts regex_1 to be immediately followed by regex_2. The lookahead is excluded from the match. It does not return matches of regex_2. The lookahead only asserts whether a match is possible or not.
*/
public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("o(?=oo)"); //Use '\\' instead of '\'.
    
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while(m.find()){
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }   
    
}
