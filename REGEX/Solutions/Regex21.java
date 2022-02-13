import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Forward reference creates a back reference to a regex that would appear later.
Forward references are only useful if they're inside a repeated group.
Then there may arise a case in which the regex engine evaluates the backreference after the group has been matched already.

//"(\\2Amigo|(go!))+"; 
Valid example
go!go!Amigo
go!
go!Amigo
*/
public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^(tac){2}tic(tac(tic)?)*$"); // Use \\ instead of using \ 
    
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
