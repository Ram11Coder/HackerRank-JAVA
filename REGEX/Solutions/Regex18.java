import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Alternations, denoted by the | character, match a single item out of several possible items separated by the vertical bar.
When used inside a character class, it will match characters; when used inside a group, it will match entire expressions
(i.e., everything to the left or everything to the right of the vertical bar). We must use parentheses to limit the use of alternations.
*/
public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^(Mr|Mrs|Ms|Dr|Er)[.][a-zA-Z]+$"); // /^(Mr?s|[MDE]r).[a-zA-Z]+$/

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
