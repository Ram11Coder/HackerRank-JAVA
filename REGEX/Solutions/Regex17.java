import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Parenthesis ( ) around a regular expression can group that part of regex together. This allows us to apply different quantifiers to that group.

These parenthesis also create a numbered capturing. It stores the part of string matched by the part of regex inside parentheses.

(?: ) can be used to create a non-capturing group. It is useful if we do not need the group to capture its match.
*/
public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(ok){3,}");//(ok) capturing 3 or more times
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}
