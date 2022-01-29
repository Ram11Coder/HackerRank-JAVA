import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//\Group_number
//This tool (\1 references the first capturing group) matches the same text as previously matched by the capturing group.
public class Solution {    
/*Other possible solutions
1. "^([a-z])(\\w)(\\s)(\\W)(\\d)(\\D)([A-Z])([A-Za-z])([aeiouAEIOU])(\\S)(\\1)(\\2)(\\3)(\\4)(\\5)(\\6)(\\7)(\\8)(\\9)(\\10)$"
2. ^([a-z]\w\s\W\d\D[A-Z][a-zA-Z][aeiouAEIOU]\S){2}$
*/
    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^([a-z]\\w\\s\\W\\d\\D[A-Z][A-Za-z][aeiouAEIOU]\\S)\\1$");
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
