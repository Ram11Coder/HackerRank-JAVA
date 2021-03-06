import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
\b assert position at a word boundary.

Three different positions qualify for word boundaries :
► Before the first character in the string, if the first character is a word character.
► Between two characters in the string, where one is a word character and the other is not a word character.
► After the last character in the string, if the last character is a word character.
*/

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("\\b[aeiouAEIOU][a-zA-Z]*\\b"); // Use \\ instead of using \ 
    
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
