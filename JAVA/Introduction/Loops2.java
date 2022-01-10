import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int prev=0,val=1;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                
                if(j==0){
                System.out.print(prev+a+(val*b)+" ");
                prev=prev+a+(b*val); 
                }
              else{
               System.out.print(prev+(val*b)+" ");
                prev=prev+(b*val);
               }
                val*=2;
              
            }
            System.out.println();
        }
        in.close();
    }
}
