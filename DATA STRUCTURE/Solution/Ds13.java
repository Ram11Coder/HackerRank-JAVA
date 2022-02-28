import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
        List<Integer> finalList=new ArrayList<>();
  Stack<String> stack=new Stack<>();
  Stack<String> maxstack=new Stack<>();
  for(String op:operations){
      if(op.contains("1")){
          String[] split=op.split(" ");
          if(!stack.isEmpty() && Integer.parseInt(split[1])>Integer.parseInt(stack.peek())){
          stack.push(split[1]);   
          maxstack.push(split[1]);       
          }
          
      }else if (op.equals("2")){
          if(!stack.isEmpty()&& maxstack.peek()==stack.peek()){
          stack.pop();
          maxstack.pop();
          }
        
      }else if(op.equals("3")){
          if(!stack.isEmpty())
        finalList.add(Integer.parseInt(maxstack.peek()));
        
      }
  }
  
  return finalList;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String opsItem = bufferedReader.readLine();
            ops.add(opsItem);
        }

        List<Integer> res = Result.getMax(ops);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
